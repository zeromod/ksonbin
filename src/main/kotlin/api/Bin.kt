package `in`.zeromod.ksonbin.api

import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.secretHeader
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable

class Bin(val ksonbin: Ksonbin) {

    /**
     * Using the CREATE API, you can Create Public and Private bins.
     *
     * @param data T (Any class with @Serializable annotated)
     * @param private Boolean (Required only if you want to mark the bin as Public)
     * @param name String? (Required only if you want to add a Name to your Bin)
     *
     * @return BinCreate<T>
     */
    suspend inline fun <reified T : Any> create(
        data: T,
        private: Boolean = true,
        name: String? = null
    ): BinCreate<T> = Ksonbin.client.post(
        scheme = Ksonbin.schema,
        host = Ksonbin.host,
        path = "/b",
        body = data
    ) {
        contentType(ContentType.Application.Json)
        secretHeader(ksonbin.secretKey)
        if (!private) header("private", false)
        if (!name.isNullOrBlank()) header("name", name)
    }

    /**
     * Using the READ API, you can Read Public and Private bins.
     *
     * @param binId String
     * @param secretKey String? (Required only if you are trying to read a private record)
     *
     * @return R (Any class with @Serializable annotated)
     */
    suspend inline fun <reified R : Any> read(
        binId: String,
        secretKey: String? = ksonbin.secretKey
    ): R = Ksonbin.client.get(
        scheme = Ksonbin.schema,
        host = Ksonbin.host,
        path = "/b/$binId/latest"
    ) {
        secretHeader(secretKey)
    }

    /**
     * Using the UPDATE API, you can Update Public and Private bins.
     *
     * @param binId String
     * @param data T (Any class with @Serializable annotated)
     * @param secretKey String? (Required only if you are trying to update a private record)
     *
     * @return BinUpdate<T>
     */
    suspend inline fun <reified T : Any> update(
        binId: String,
        data: T,
        secretKey: String? = ksonbin.secretKey
    ): BinUpdate<T> = Ksonbin.client.put(
        scheme = Ksonbin.schema,
        host = Ksonbin.host,
        path = "/b/$binId",
        body = data
    ) {
        secretHeader(secretKey)
        contentType(ContentType.Application.Json)
    }

    /**
     * Using the DELETE API, you can Delete the Public  or a Private bins.
     *
     * @param binId String
     *
     * @return BinDelete
     */
    suspend fun delete(
        binId: String
    ): BinDelete = Ksonbin.client.delete(
        scheme = Ksonbin.schema,
        host = Ksonbin.host,
        path = "/b/$binId"
    ) {
        secretHeader(ksonbin.secretKey)
    }
}

@Serializable
data class BinCreate<T>(
    val success: Boolean,
    val data: T,
    val id: String,
    val private: Boolean
)

@Serializable
data class BinUpdate<T>(
    val success: Boolean,
    val data: T,
    val version: Int,
    val parentId: String
)

@Serializable
data class BinDelete(
    val success: Boolean,
    val id: String,
    val message: String
)