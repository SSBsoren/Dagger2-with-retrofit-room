package com.sagen.demo.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sagen.demo.model.Product

@Database(entities = [Product::class], version = 1)
abstract class RoomDB : RoomDatabase() {
    abstract fun getMainDao(): MainDao
}