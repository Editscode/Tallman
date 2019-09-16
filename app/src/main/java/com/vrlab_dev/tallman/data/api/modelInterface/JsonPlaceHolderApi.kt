package com.vrlab_dev.tallman.data.api.modelInterface

import com.vrlab_dev.tallman.data.vo.Manifest
import com.vrlab_dev.tallman.data.vo.Voyager
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path

//https://untwisted-trailers.000webhostapp.com/api/post/read.php
//https://untwisted-trailers.000webhostapp.com/api/post/read_CallSign.php?CallSign=D7AA
interface JsonPlaceHolderApi {
    @GET("read.php")
    fun getVoyager(): Single<Voyager>

    @GET("read_CallSign.php?CallSign={callSign}")
     fun getCallSign(@Path("callSign") str: String): Call<List<Manifest>>
}