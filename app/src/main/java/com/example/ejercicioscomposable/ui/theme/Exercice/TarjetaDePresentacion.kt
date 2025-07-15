package com.example.ejercicioscomposable.ui.theme.Exercice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicioscomposable.R

@Composable
fun TarjetaDePresentacion(){
    Column (Modifier.padding()){
Spacer(modifier = Modifier.height(32.dp))
        Text(text= "Wordy Marte" , fontSize = 12.sp , fontWeight = FontWeight.Normal)
        Text(text = "Ingenieria de software", color = colorResource(id= R.color.grey))
        Text(text= "Wordymarte@gmail.com")
    }
}