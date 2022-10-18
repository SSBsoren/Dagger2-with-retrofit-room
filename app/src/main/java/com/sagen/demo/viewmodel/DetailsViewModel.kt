package com.sagen.demo.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class DetailsViewModel @Inject constructor( private val randomize: Randomize) : ViewModel() {
    init {
        randomize.doAction()
    }
}