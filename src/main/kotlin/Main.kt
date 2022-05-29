import kotlinx.coroutines.*

fun main() {
    println("Start: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work start: ${Thread.currentThread().name}")
        mySuspendFunc(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    runBlocking {
        mySuspendFunc(2500)
    }
    println("End: ${Thread.currentThread().name}")
}

suspend fun mySuspendFunc (time: Long) {
    delay(time)
}