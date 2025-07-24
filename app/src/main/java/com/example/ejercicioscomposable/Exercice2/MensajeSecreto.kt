package com.example.ejercicioscomposable.Exercice2

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

@Composable
fun MensajeSecreto(){
var mostrarMensaje by remember { mutableStateOf(true) }

    Button(onClick = { mostrarMensaje = !mostrarMensaje }) {

        Text("Revelar Secreto")
    }
    if (mostrarMensaje
        ){
        Text("Revelaste el mensaje secreto  ")
    }else{
        Text("No te puedo mostrar el mensaje")
    }
}