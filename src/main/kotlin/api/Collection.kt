package `in`.zeromod.ksonbin.api

import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.secretHeader
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable

class Collection(private val ksonbin: Ksonbin) {

    /**
     * Using the COLLECTIONS CREATE API, you can CREATE Collections to group the records
     * which later, can be fetched usin the Query Builder.
     *
     * @param name String
     *
     * @return [CollectionCreate]
     */
    suspend fun create(
        name: String
    ): CollectionCreate = ksonbin.client.post(
        scheme = ksonbin.scheme,
        host = ksonbin.host,
        path = "/c",
        body = CollectionInfo(name)
    ) {
        contentType(ContentType.Application.Json)
        secretHeader(ksonbin.secretKey)
    }

    /**
     * Using the COLLECTIONS UPDATE API, you can UPDATE Collections name for now.
     * We might add more meta data to the Collections which you can
     * use the Update API for.
     *
     * @param collectionID String
     * @param name String
     * @param schemaDocId String? (Required only if you want to attach a Schema Doc to the Collection)
     * @param removeSchemaDoc Boolean (Required only if you want to detach a Schema Doc from the Collection)
     *
     * @return [CollectionUpdate]
     */
    suspend fun update(
        collectionID: String,
        name: String,
        schemaDocId: String? = null,
        removeSchemaDoc: Boolean = false
    ): CollectionUpdate = ksonbin.client.put(
        scheme = ksonbin.scheme,
        host = ksonbin.host,
        path = "/c/$collectionID",
        body = CollectionInfo(name)
    ) {
        contentType(ContentType.Application.Json)
        secretHeader(ksonbin.secretKey)
        if (!schemaDocId.isNullOrBlank()) header("schema-doc-id", schemaDocId)
        if (removeSchemaDoc) header("remove-schema-doc", true)
    }
}

@Serializable
data class CollectionInfo(
    val name: String
)

@Serializable
data class CollectionCreate(
    val success: Boolean,
    val data: CollectionInfo,
    val id: String
)

@Serializable
data class CollectionUpdate(
    val success: Boolean,
    val data: CollectionInfo,
    val collectionID: String
)