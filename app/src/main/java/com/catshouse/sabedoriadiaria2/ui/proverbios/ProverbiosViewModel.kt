package com.catshouse.sabedoriadiaria2.ui.proverbios

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.catshouse.sabedoriadiaria2.R

class ProverbiosViewModel : ViewModel() {

    private val _text = MutableLiveData<Int>().apply {
        value = R.layout.activity_proverbios

    }
    val text: LiveData<Int> = _text
}