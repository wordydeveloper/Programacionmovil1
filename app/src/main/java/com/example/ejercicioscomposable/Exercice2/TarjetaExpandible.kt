package com.example.ejercicioscomposable.Exercice2

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TarjetaExpandible(){
    var expandido by remember { mutableStateOf(false) }
    Column (Modifier.padding(12.dp)
        .border(2.dp, color = Black)
        .clickable{expandido = !expandido}
        ){
        Text("Bienvenido")
        if (expandido){
            Text("La targeta esta expandida")
        }
    }
}