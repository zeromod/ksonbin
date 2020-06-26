package `in`.zeromod.ksonbin.api

import `in`.zeromod.ksonbin.Ksonbin
import com.squareup.moshi.Json
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface BinApi {
    @POST("/b")
    suspend fun create(
        @Body data: RequestBody,
        @Header(value = "secret-key") secretKey: String = Ksonbin.key
    ): Response<BinCreateResponse>
}

data class BinCreateResponse(
    @Json(name = "success") val success: Boolean,
    @Json(name = "data") val data: String,
    @Json(name = "id") val id: String
)
