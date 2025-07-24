package com.example.ejercicioscomposable.Exercice2

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun AppDeSaludos(){
    var nombre  by remember { mutableStateOf("") }
    var saludo  by remember { mutableStateOf("") }
TextField(
    value = nombre ,
    onValueChange = { nombre = it } ,
    label = { Text("ingresa tu nombre ") }
)
    Button(onClick = { saludo ="Hola , $nombre" }) {
    Text("Saludar")
    }
Text(text = saludo)

}