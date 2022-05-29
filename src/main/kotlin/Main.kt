import kotlinx.coroutines.*

fun main() {
    println("Start: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work start: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    runBlocking {
        delay(2500)
    }
    println("End: ${Thread.currentThread().name}")
}