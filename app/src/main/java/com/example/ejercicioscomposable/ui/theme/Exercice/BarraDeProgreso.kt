package com.example.ejercicioscomposable.ui.theme.Exercice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicioscomposable.R

@Composable
fun BarraDeProgreso(progreso: Float) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(15.dp)
            .background(colorResource(R.color.grey))
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight() // Asegura que tenga la misma altura que el contenedor
                .fillMaxWidth(progreso.coerceIn(0f, 1f))
                .background(colorResource(R.color.purple_500))
        )
    }
}
