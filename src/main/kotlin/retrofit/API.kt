package `in`.zeromod.ksonbin.retrofit

import retrofit2.Response

object API {
    inline fun <reified T> create(baseUrl: String): T =
        Service.retrofit(baseUrl).create(T::class.java)
}

sealed class ApiResult<out R> {
    data class Success<out R>(val value: R) : ApiResult<R>()
    data class Failure(val code: Int, val message: String) : ApiResult<Nothing>()
    data class Error(val exception: Exception) : ApiResult<Nothing>()
}

suspend fun <R> apiCall(
    call: suspend () -> Response<R>
): ApiResult<R> {
    return try {
        val response: Response<R> = call()
        when (response.isSuccessful) {
            true -> ApiResult.Success(response.body()!!)
            false -> ApiResult.Error(Exception(response.message()))
        }
    } catch (e: Exception) {
        ApiResult.Error(e)
    }
}