package com.sagen.demo.di

import android.content.Context
import androidx.room.Room
import com.sagen.demo.room.RoomDB
import com.sagen.demo.utils.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabaseInstance(context:Context): RoomDB {
        return Room.databaseBuilder(context, RoomDB::class.java, Constants.DATABASE_NAME).build()
    }
}