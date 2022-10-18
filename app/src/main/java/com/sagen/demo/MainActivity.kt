package com.sagen.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.sagen.demo.viewmodel.MainViewModel
import com.sagen.demo.viewmodel.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as DemoApplication).appComponent.inject(this)

        mainViewModel = ViewModelProvider(this, mainViewModelFactory)[MainViewModel::class.java]

        getProducts()
    }

    private fun getProducts() {
        mainViewModel.productLiveData.observe(this) {
            Log.v(TAG, "Products :  ${it.joinToString { x -> x.title } } ")
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}