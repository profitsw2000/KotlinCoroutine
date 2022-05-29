import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val jobDeffered: Deferred<Unit> = async {
        println("Fake work start: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    jobDeffered.join()

    println("End: ${Thread.currentThread().name}")
}