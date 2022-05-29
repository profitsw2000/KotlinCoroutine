import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start: ${Thread.currentThread().name}")

    val jobDeferred: Deferred<String> = async {
        println("Fake work start: ${Thread.currentThread().name}")
        delay(2000)
        println("Fake work end: ${Thread.currentThread().name}")
        "MyString"
    }

    val myString: String = jobDeferred.await()
    println(myString)

    println("End: ${Thread.currentThread().name}")
}