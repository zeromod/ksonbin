import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.payloads.BinCreate
import `in`.zeromod.ksonbin.payloads.BinDelete
import `in`.zeromod.ksonbin.payloads.BinUpdate
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable

fun main() {
    Ksonbin.init("\$2b\$10\$KcbqnBVB62yaqvfRiT39i.b4aGMhuqZP8XXywC6gvhdRwJzMZrGRy")
    runBlocking {
        val newBin: BinCreate<HelloWorld> = Ksonbin.bin.create(HelloWorld("Hello"))
        println("created new bin : $newBin")

        val helloWorld: HelloWorld = Ksonbin.bin.read(newBin.id)
        println("read bin ${newBin.id}: $helloWorld")

        val updatedBin: BinUpdate<HelloWorld> = Ksonbin.bin.update(newBin.id, HelloWorld("Hi"))
        println("update bin ${newBin.id}: $updatedBin")

        val deletedBin: BinDelete = Ksonbin.bin.delete(newBin.id)
        println("deleted bin ${newBin.id}: $deletedBin")
    }
}

@Serializable
data class HelloWorld(
    val message: String
)