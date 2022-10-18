package com.sagen.demo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.sagen.demo.model.Product
import com.sagen.demo.retrofit.ApiServices
import com.sagen.demo.room.RoomDB
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiServices: ApiServices,private val roomDB: RoomDB) {
    private val _products = MutableLiveData<List<Product>>()

    val products: LiveData<List<Product>> get() = _products

    suspend fun getProducts() {
        val result = apiServices.getProducts()
        if (result.isSuccessful && result.body() != null) {
            roomDB.getMainDao().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }

}