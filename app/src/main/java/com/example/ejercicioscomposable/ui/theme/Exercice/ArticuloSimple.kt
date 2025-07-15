package com.example.ejercicioscomposable.ui.theme.Exercice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArticuloSimple(){
    Column (modifier = Modifier.padding(16.dp)){
        Text("Aprendiendo Jetpack Compose", fontSize = 15.sp , fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text("En Kotlin Compose, puedes mostrar emojis usando cadenas de texto que contienen los caracteres Unicode de los emojis. No hay una función específica para emojis en Compose, simplemente se tratan como texto. Puedes usar el teclado de tu dispositivo para insertar emojis directamente en t")
    }
}