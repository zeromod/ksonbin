import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.api.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.Serializable

fun main() {
    Ksonbin.init("\$2b\$10\$KcbqnBVB62yaqvfRiT39i.b4aGMhuqZP8XXywC6gvhdRwJzMZrGRy")
    runBlocking {
        binSample()
        collectionSample()
    }
}

suspend fun binSample() {
    val newBin: BinCreate<HelloWorld> = Ksonbin.bin.create(HelloWorld("Hello"))
    println("created new bin : $newBin")

    val helloWorld: HelloWorld = Ksonbin.bin.read(newBin.id)
    println("read bin ${newBin.id}: $helloWorld")

    val updatedBin: BinUpdate<HelloWorld> = Ksonbin.bin.update(newBin.id, HelloWorld("Hi"))
    println("update bin ${newBin.id}: $updatedBin")

    val deletedBin: BinDelete = Ksonbin.bin.delete(newBin.id)
    println("deleted bin ${newBin.id}: $deletedBin")
}

suspend fun collectionSample() {
    val collectionCreate: CollectionCreate = Ksonbin.collection.create("partha")
    println(collectionCreate)

    val collectionUpdate: CollectionUpdate = Ksonbin.collection.update(collectionCreate.id, "ksonbin")
    println(collectionUpdate)
}

@Serializable
data class HelloWorld(
    val message: String
)