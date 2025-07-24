package com.example.ejercicioscomposable.ui.theme.Exercice1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun IconosSociales(){
    Row (modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){

        val emoji1 ="\uD83D\uDE80"
        Text("$emoji1")
        val emoji2 ="\uD83D\uDE89"
        Text("$emoji2")
        val emoji3 ="\uD83D\uDE80"
        Text("$emoji3")

    }
}