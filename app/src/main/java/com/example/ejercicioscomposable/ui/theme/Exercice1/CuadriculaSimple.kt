package com.example.ejercicioscomposable.ui.theme.Exercice1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.ejercicioscomposable.R

@Composable
fun CuadriculaSimple(){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center //esto lo puse para observar mejor el 2x2
        ) {
        Row {
            Box(modifier = Modifier.weight(1f))
            Box(modifier = Modifier.weight(1f))
        }
        Row{
            Box(
                modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .background(colorResource(R.color.grey))
                )

            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                .background(colorResource(R.color.purple_200))

            )
        }
    }
}