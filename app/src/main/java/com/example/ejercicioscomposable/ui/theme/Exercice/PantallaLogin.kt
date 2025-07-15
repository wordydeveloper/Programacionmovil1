package com.example.ejercicioscomposable.ui.theme.Exercice

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.ejercicioscomposable.R

@Composable
fun PantallaLogin(Usuario:String,Contraseña:String){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
Text("Bienvenid@s")
        Spacer(modifier = Modifier.padding() )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, color = colorResource(R.color.purple_500))

        )
        Spacer(modifier = Modifier.padding() )
        Text(text = Usuario)
        Spacer(modifier = Modifier.padding() )
        Text(text = Contraseña)
            Spacer(modifier = Modifier.padding(19.dp) )

        Text("Iniciar Seccion",
            color = colorResource(R.color.grey),
            modifier = Modifier.padding(15.dp))


    }
}