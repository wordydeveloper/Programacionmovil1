package com.example.ejercicioscomposable.ui.theme.Exercice1

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
    fun ItemDeRecibo ( nombre:String ,precio:String){
   Row (modifier = Modifier.fillMaxWidth(),
       verticalAlignment = Alignment.CenterVertically
       ){
    Text(text = precio)
       Spacer(modifier = Modifier.weight(1f))
       Text(text = nombre)
   }
}