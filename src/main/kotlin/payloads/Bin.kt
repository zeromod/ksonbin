package `in`.zeromod.ksonbin.payloads

import kotlinx.serialization.Serializable

@Serializable
data class BinCreateResponse<T>(
    val success: Boolean,
    val data: T,
    val id: String,
    val private: Boolean
)