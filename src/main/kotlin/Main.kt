import kotlin.concurrent.thread

fun main() {
    println("Start: ${Thread.currentThread().name}")
    println("End: ${Thread.currentThread().name}")
}