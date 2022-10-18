package com.sagen.demo.di

import androidx.lifecycle.ViewModel
import com.sagen.demo.viewmodel.DetailsViewModel
import com.sagen.demo.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    @ClassKey(DetailsViewModel::class)
    @IntoMap
    abstract fun detailsViewModel(detailsViewModel: DetailsViewModel): ViewModel

}