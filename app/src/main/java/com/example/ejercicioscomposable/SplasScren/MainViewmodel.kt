package com.example.ejercicioscomposable.SplasScren

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _isLoading = MutableStateFlow(true)
    val isLoading = _isLoading.asStateFlow()

    init {
        // Simula carga inicial (API, prefs, etc.)
        viewModelScope.launch {
            delay(1500) // 1.5 s
            _isLoading.value = false
        }
    }
}
