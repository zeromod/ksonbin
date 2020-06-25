import `in`.zeromod.ksonbin.Ksonbin
import `in`.zeromod.ksonbin.api.Bin
import `in`.zeromod.ksonbin.api.BinCreateResponse
import `in`.zeromod.ksonbin.retrofit.ApiResult
import kotlinx.coroutines.runBlocking

fun main() {
    Ksonbin.init("\$2b\$10\$KcbqnBVB62yaqvfRiT39i.b4aGMhuqZP8XXywC6gvhdRwJzMZrGRy")
    runBlocking {
        when (val result: ApiResult<BinCreateResponse> = Bin.create("{\n  \"data\": \"Hello World\"\n}")) {
            is ApiResult.Success -> {
                println(result.value.data)
            }
            is ApiResult.Failure -> {
                println("${result.code} : ${result.message}")
            }
            is ApiResult.Error -> {
                result.exception.printStackTrace()
            }
        }.exhaustive
    }
}


val <T> T.exhaustive: T
    get() = this