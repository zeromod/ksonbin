package `in`.zeromod.ksonbin.api

import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.retrofit.API
import `in`.zeromod.ksonbin.retrofit.ApiResult
import `in`.zeromod.ksonbin.retrofit.apiCall
import com.squareup.moshi.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

object Bin {
    private val binApi: BinApi = API.create(Ksonbin.root)
    suspend fun create(data: String): ApiResult<BinCreateResponse> = apiCall {
        binApi.create(
            data.toRequestBody("application/json; charset=utf-8".toMediaType())
        )
    }
}

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