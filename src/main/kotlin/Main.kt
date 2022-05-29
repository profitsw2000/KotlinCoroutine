import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val job: Job = launch(Dispatchers.Default) {
        try {
            for (i in 0..10) {
                println(i)
                Thread.sleep(1000)
            }
        } catch (ex: CancellationException) {
            println("\nCaught exception!!")
        } finally {
            println("\nFinal block.")
        }
    }

    delay(3000)
    job.cancelAndJoin()

    println("End: ${Thread.currentThread().name}")
}