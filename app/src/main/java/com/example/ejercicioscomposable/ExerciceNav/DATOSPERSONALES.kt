package com.example.ejercicioscomposable.ExerciceNav

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaDatosPersonales(onNavigateToNext: () -> Unit) {
    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp)) {

        Text("Paso 1: Datos Personales", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onNavigateToNext,
            enabled = nombre.isNotBlank() && email.isNotBlank(),
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Siguiente")
        }
    }
}
