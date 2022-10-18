package com.sagen.demo.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sagen.demo.model.Product
import com.sagen.demo.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(   private val repository: ProductRepository) : ViewModel() {
    val productLiveData: LiveData<List<Product>> get() = repository.products
    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }
}

class Randomize @Inject constructor(){
    fun doAction(){
        Log.d("MainViewModel","Random Action")
    }
}