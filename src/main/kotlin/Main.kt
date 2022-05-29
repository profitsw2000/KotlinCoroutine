import kotlinx.coroutines.*

fun main() {
    println("Start: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work start: ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    Thread.sleep(2500)
    println("End: ${Thread.currentThread().name}")
}