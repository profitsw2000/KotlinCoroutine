import kotlin.concurrent.thread

fun main() {
    println("Start: ${Thread.currentThread().name}")

    thread {
        println("Fake work start: ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Fake work end: ${Thread.currentThread().name}")
    }

    println("End: ${Thread.currentThread().name}")
}