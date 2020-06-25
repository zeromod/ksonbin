package `in`.zeromod.ksonbin.retrofit

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object Service {
    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val moshi: Moshi = Moshi.Builder()
        .build()

    private val client = OkHttpClient().newBuilder().run {
        addInterceptor(loggingInterceptor)
        readTimeout(60, TimeUnit.SECONDS)
        connectTimeout(30, TimeUnit.SECONDS)
        build()
    }

    fun retrofit(baseUrl: String): Retrofit = Retrofit.Builder()
        .client(client)
        .baseUrl(baseUrl)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
}