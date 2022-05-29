import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val result: String? = withTimeoutOrNull(3000) {
        for (i in 0..10) {
            println(i)
            delay(100)
        }
        "I'm done!"
    }

    println("Result = $result")
    println("End: ${Thread.currentThread().name}")
}