package com.vrlab_dev.tallman.data.api

import com.vrlab_dev.tallman.data.api.modelInterface.JsonPlaceHolderApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.util.concurrent.TimeUnit

const val BASE_URL = "https://untwisted-trailers.000webhostapp.com/api/post/"
object DbClient {
    fun getClient(): JsonPlaceHolderApi {

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(60, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JsonPlaceHolderApi::class.java)

    }
}