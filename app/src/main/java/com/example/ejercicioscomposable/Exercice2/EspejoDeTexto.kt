package com.example.ejercicioscomposable.Exercice2

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun EspejoDeTexto(){
    var  texto by remember { mutableStateOf("") }
    TextField(
        value = texto,
        onValueChange = {texto=it}
    )
    Text(text = " Tu estas escribiendo : $texto")
}