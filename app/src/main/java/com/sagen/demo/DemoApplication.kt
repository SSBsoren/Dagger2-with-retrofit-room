package com.sagen.demo

import android.app.Application
import com.sagen.demo.di.AppComponent
import com.sagen.demo.di.DaggerAppComponent

class DemoApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }
}