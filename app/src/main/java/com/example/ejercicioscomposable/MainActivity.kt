package com.example.ejercicioscomposable

import TarjetaDeNoticia
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicioscomposable.ui.theme.EjerciciosComposableTheme
import com.example.ejercicioscomposable.ui.theme.Exercice.ArticuloSimple
import com.example.ejercicioscomposable.ui.theme.Exercice.BarraDeProgreso
import com.example.ejercicioscomposable.ui.theme.Exercice.CuadriculaSimple
import com.example.ejercicioscomposable.ui.theme.Exercice.IconosSociales
import com.example.ejercicioscomposable.ui.theme.Exercice.ItemDeRecibo
import com.example.ejercicioscomposable.ui.theme.Exercice.MiPrimerComposable
import com.example.ejercicioscomposable.ui.theme.Exercice.PantallaLogin
import com.example.ejercicioscomposable.ui.theme.Exercice.PerfilDeUsuario
import com.example.ejercicioscomposable.ui.theme.Exercice.TarjetaDePresentacion

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjerciciosComposableTheme {
               /*ejercicio1 MiPrimerComposable()*/
               /*ejercicio2 TarjetaDePresentacion()*/
                /* ejercicio3 IconosSociales()*/
                /* ejercicio4 ArticuloSimple()*/
                 /* ejercicio5 PerfilDeUsuario()*/
                 /* ejercicio6 CuadriculaSimple()*/
                //solo no lo lograria estar en medio de la pantalla

                /* ejercicio7
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                ItemDeRecibo("jugo","400")
                ItemDeRecibo("leche rica","340")
                ItemDeRecibo("manzana","42.10")
            }
        */
               /* ejercicio 8  Scaffold { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding) // esencial para respetar sistema
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center
                    ) {
                        BarraDeProgreso(0.9f)
                        Spacer(modifier = Modifier.height(8.dp))
                        BarraDeProgreso(0.2f)
                        Spacer(modifier = Modifier.height(8.dp))
                        BarraDeProgreso(1.0f)
                    }
                }
                */
            /* ejercicio 9
                TarjetaDeNoticia(
                    titulo = "Descubren nueva especie de rana en Amazonas",
                    autor = "Redacción EcoNoticias",
                    fecha = "11 de julio de 2025"
                )
*/

                PantallaLogin("jose","jose12")
    }
  }
  }
  }


