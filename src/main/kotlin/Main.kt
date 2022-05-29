import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val job: Job = launch {
        for (i in 0..10) {
            Thread.sleep(1000)
            println(i)
        }
    }

    delay(3000)
    job.cancel()
    job.join()

    println("End: ${Thread.currentThread().name}")
}