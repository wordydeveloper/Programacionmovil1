package com.example.ejercicioscomposable.ExerciceNav

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaConfirmacion(onNavigateToNext: () -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp)) {

        Text("Paso 3: Confirmación", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))

        Text("Revisa todos los datos ingresados antes de enviar la solicitud.")
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onNavigateToNext,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Finalizar y Enviar")
        }
    }
}
