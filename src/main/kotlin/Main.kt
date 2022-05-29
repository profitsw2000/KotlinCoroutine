import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work start: ${Thread.currentThread().name}")
        mySuspendFunc(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    mySuspendFunc(2500)

    println("End: ${Thread.currentThread().name}")
}

suspend fun mySuspendFunc (time: Long) {
    delay(time)
}