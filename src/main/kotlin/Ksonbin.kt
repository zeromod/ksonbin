package `in`.zeromod.ksonbin

import `in`.zeromod.ksonbin.api.Bin
import `in`.zeromod.ksonbin.api.Collection
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.defaultSerializer
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.header
import io.ktor.http.URLProtocol

object Ksonbin {
    var schema = URLProtocol.HTTPS.name
    var host = "api.jsonbin.io"
    const val SECRET_KEY = "secret-key"
    lateinit var secretKey: String
        private set

    fun init(secretKey: String) {
        this.secretKey = secretKey
    }

    val client = HttpClient {
        install(JsonFeature) {
            serializer = defaultSerializer()
        }
    }
    val bin = Bin(this)
    val collection = Collection(this)
}

fun HttpRequestBuilder.secretHeader(secretKey: String?) {
    secretKey?.let { header(Ksonbin.SECRET_KEY, it) }
}