package com.example.ejercicioscomposable.Exercice2
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import kotlin.random.nextInt

@Composable
fun CambiadorDeColor(){
    var color by remember { mutableStateOf(Color.Gray) }


        Box(modifier = Modifier
            .size(100.dp)
            .background(color)
        )

        Button(onClick = {
            color= Color(Random.nextInt(256),
                Random.nextInt(256)
                ,Random.nextInt(256))
        }) {

            Text("Cambiar Color")
        }


}