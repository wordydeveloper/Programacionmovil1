package com.example.ejercicioscomposable.ui.theme.Exercice1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PerfilDeUsuario(){
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("\uD83D\uDE36\u200D\uD83C\uDF2B\uFE0F", fontSize =140.sp )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text("wordy25" , fontSize = 12.sp)
                Text("EN linea", fontSize = 12.sp)
            }
        }
    }
}