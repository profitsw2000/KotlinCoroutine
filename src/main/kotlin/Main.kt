import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    withTimeout(3000) {
        for (i in 0..10) {
            println(i)
            delay(1000)
        }
    }

    println("End: ${Thread.currentThread().name}")
}