package com.martserra.mydogs.api

import com.martserra.mydogs.DOGS_BASE_URL
import com.martserra.mydogs.DOGS_LIST
import com.martserra.mydogs.api.responses.DogListApiResponse
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl(DOGS_BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()

interface ApiService {
    @GET(DOGS_LIST)
    suspend fun getAllDogs(): DogListApiResponse
}

object DogApi {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}