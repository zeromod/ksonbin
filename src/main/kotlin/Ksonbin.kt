package `in`.zeromod.ksonbin

import `in`.zeromod.ksonbin.api.BinApi
import `in`.zeromod.ksonbin.api.BinCreateResponse
import `in`.zeromod.ksonbin.retrofit.API
import `in`.zeromod.ksonbin.retrofit.ApiResult
import `in`.zeromod.ksonbin.retrofit.apiCall
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody

object Ksonbin {
    var root: String = "https://api.jsonbin.io/"
    lateinit var key: String
        private set

    fun init(secretKey: String) {
        key = secretKey
    }

    object Bin {
        private val binApi: BinApi = API.create(root)
        suspend fun create(data: String): ApiResult<BinCreateResponse> = apiCall {
            binApi.create(
                data.toRequestBody("application/json; charset=utf-8".toMediaType())
            )
        }
    }
}