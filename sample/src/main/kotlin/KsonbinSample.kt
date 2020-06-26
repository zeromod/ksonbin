import `in`.zeromod.ksonbin.Ksonbin
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable

fun main() {
    Ksonbin.init("\$2b\$10\$KcbqnBVB62yaqvfRiT39i.b4aGMhuqZP8XXywC6gvhdRwJzMZrGRy")
    runBlocking {
        val response = Ksonbin.Bin.create(HelloWorld("hey"))
        println(response)
    }
}

@Serializable
data class HelloWorld(
    val message: String
)