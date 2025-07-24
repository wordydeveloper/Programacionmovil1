package com.example.ejercicioscomposable.Exercice2
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun FormularioSimple(){
    var texto by remember { mutableStateOf("")
    }
    Column (
        ){
        TextField(

            value = texto,
            onValueChange = {texto = it},
            label = { Text("Escribe algo") }
        )
        Button(onClick = {},
            enabled = texto.isNotEmpty()) {
                Text("Enviar")

            }
    }
}