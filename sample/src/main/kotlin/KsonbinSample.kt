import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.api.*
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

fun main() {
    //TODO: Add jsonbin secret-key here
    Ksonbin.init("YOUR_KEY_HERE")
    runBlocking {
        binSample()
        collectionSample()
        schemaSample()
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

suspend fun schemaSample() {
    val schemaCreate: SchemaCreate<LocationSchema> = Ksonbin.schema.create(
        "locationSchema",
        LocationSchema()
    )
    println(schemaCreate)

    val schemaRead: LocationSchema = Ksonbin.schema.read(schemaCreate.id)
    println(schemaRead)

    val schemaUpdate: SchemaUpdate<LocationSchema> = Ksonbin.schema.update(
        schemaCreate.id,
        LocationSchema(description = "Geo location schema")
    )
    println(schemaUpdate)

}

@Serializable
data class HelloWorld(
    val message: String
)

@Serializable
data class LocationSchema(
    @SerialName("\$id") val id: String = "https://example.com/geographical-location.schema.json",
    @SerialName("\$schema") val schema: String = "http://json-schema.org/draft-07/schema#",
    val title: String = "Longitude and Latitude Values",
    val description: String = "A geographical coordinate.",
    val required: List<String> = listOf("latitude", "longitude"),
    val type: String = "object",
    val properties: Property = Property()
)

@Serializable
data class Property(
    val latitude: Latitude = Latitude(),
    val longitude: Longitude = Longitude()
)

@Serializable
data class Latitude(
    val type: String = "number",
    val minimum: Int = -90,
    val maximum: Int = 90
)

@Serializable
data class Longitude(
    val type: String = "number",
    val minimum: Int = -180,
    val maximum: Int = 180
)