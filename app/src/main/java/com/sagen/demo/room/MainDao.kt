package com.sagen.demo.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sagen.demo.model.Product

@Dao
interface MainDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProducts(products: List<Product>)

    @Query("SELECT * FROM products")
    suspend fun getProducts(): List<Product>
}