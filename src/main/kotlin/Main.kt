import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val job: Job = launch(Dispatchers.Default) {
        for (i in 0..10) {
            if (!isActive){
                return@launch
            }
            println(i)
            Thread.sleep(1000)
        }
    }

    delay(3000)
    job.cancelAndJoin()

    println("End: ${Thread.currentThread().name}")
}