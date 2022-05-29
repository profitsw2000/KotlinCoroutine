import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val job: Job = launch(Dispatchers.Default) {
        try {
            for (i in 0..10) {
                println(i)
                delay(1000)
            }
        } catch (ex: CancellationException) {
            println("\nCaught exception: ${ex.message}")
        } finally {
            withContext(NonCancellable) {
                delay(5000)
                println("\nFinal block.")
            }
        }
    }

    delay(3000)
    job.cancel("My exception!!")
    job.join()

    println("End: ${Thread.currentThread().name}")
}