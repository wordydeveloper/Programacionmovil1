package com.example.ejercicioscomposable.ExerciceNav

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaBienvenida(onNavigateToNext: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Bienvenido", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Inicia tu solicitud completando los siguientes pasos.")
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = onNavigateToNext) {
            Text("Iniciar Solicitud")
        }
    }
}
