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
     * @param data SCHEMA
     *
     * @return SchemaCreate<SCHEMA>
     */
    suspend inline fun <reified SCHEMA : Any> create(
        name: String,
        data: SCHEMA
    ): SchemaCreate<SCHEMA> = ksonbin.client.post(
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
     * @return SCHEMA
     */
    suspend inline fun <reified SCHEMA : Any> read(
        schemaId: String
    ): SCHEMA = ksonbin.client.get(
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
     * @param data SCHEMA
     *
     * @return SchemaUpdate<SCHEMA>
     */
    suspend inline fun <reified SCHEMA : Any> update(
        schemaId: String,
        data: SCHEMA
    ): SchemaUpdate<SCHEMA> = ksonbin.client.put(
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
data class SchemaCreate<SCHEMA>(
    val success: Boolean,
    val data: SCHEMA,
    val id: String
)

@Serializable
data class SchemaUpdate<SCHEMA>(
    val success: Boolean,
    val data: SCHEMA,
    val id: String
)