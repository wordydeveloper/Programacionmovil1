package com.example.ejercicioscomposable.ExerciceNav

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaDatosFinancieros(onNavigateToNext: () -> Unit) {
    var ingresos by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp)) {

        Text("Paso 2: Datos Financieros", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = ingresos,
            onValueChange = { ingresos = it },
            label = { Text("Ingresos Mensuales") },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onNavigateToNext,
            enabled = ingresos.isNotBlank(),
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Siguiente")
        }
    }
}
