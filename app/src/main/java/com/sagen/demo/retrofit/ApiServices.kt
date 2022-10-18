package com.sagen.demo.retrofit

import com.sagen.demo.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("products")
    suspend fun getProducts(): Response<List<Product>>
}