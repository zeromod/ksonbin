package `in`.zeromod.ksonbin

import `in`.zeromod.ksonbin.payloads.BinCreateResponse
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.defaultSerializer
import io.ktor.client.request.header
import io.ktor.client.request.post
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.contentType

object Ksonbin {
    var root: String = "https://api.jsonbin.io/"
    lateinit var secretKey: Pair<String, String>
        private set

    fun init(secretKey: String) {
        this.secretKey = "secret-key" to secretKey
    }

    val client = HttpClient {
        install(JsonFeature) {
            serializer = defaultSerializer()
        }
    }

    object Bin {
        suspend inline fun <reified T : Any> create(data: T): BinCreateResponse<T> {
            return client.post {
                url("https://api.jsonbin.io/b")
                header(secretKey.first, secretKey.second)
                contentType(ContentType.Application.Json)
                body = data
            }
        }
    }
}