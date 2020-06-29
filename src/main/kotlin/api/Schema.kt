package `in`.zeromod.ksonbin.api

import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.secretHeader
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.put
import io.ktor.http.ContentType
import io.ktor.http.contentType
import kotlinx.serialization.Serializable

class Schema(val ksonbin: Ksonbin) {
    /**
     * Using the CREATE API, you can Create Schema Docs.
     *
     * @param name String
     * @param data D
     *
     * @return SchemaCreate<D>
     */
    suspend inline fun <reified D : Any> create(
        name: String,
        data: D
    ): SchemaCreate<D> = ksonbin.client.post(
        scheme = ksonbin.scheme,
        host = ksonbin.host,
        path = "/s",
        body = data
    ) {
        contentType(ContentType.Application.Json)
        secretHeader(ksonbin.secretKey)
        header("name", name)
    }

    /**
     * Using the READ API, you can Read the Schema Docs.
     *
     * @param schemaId String
     *
     * @return D
     */
    suspend inline fun <reified D : Any> read(
        schemaId: String
    ): D = ksonbin.client.get(
        scheme = ksonbin.scheme,
        host = ksonbin.host,
        path = "/s/$schemaId"
    ) {
        secretHeader(ksonbin.secretKey)
    }

    /**
     * Using the UPDATE API, you can Update Schema Docs.
     *
     * @param schemaId String
     * @param data D
     *
     * @return SchemaUpdate<D>
     */
    suspend inline fun <reified D : Any> update(
        schemaId: String,
        data: D
    ): SchemaUpdate<D> = ksonbin.client.put(
        scheme = ksonbin.scheme,
        host = ksonbin.host,
        path = "/s/$schemaId",
        body = data
    ) {
        contentType(ContentType.Application.Json)
        secretHeader(ksonbin.secretKey)
    }
}

@Serializable
data class SchemaCreate<D>(
    val success: Boolean,
    val data: D,
    val id: String
)

@Serializable
data class SchemaUpdate<D>(
    val success: Boolean,
    val data: D,
    val id: String
)