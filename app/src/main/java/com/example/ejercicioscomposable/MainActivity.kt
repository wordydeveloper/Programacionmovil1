package com.example.ejercicioscomposable

import ContadorDeClics
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.ejercicioscomposable.Exercice2.AppDeSaludos
import com.example.ejercicioscomposable.Exercice2.CambiadorDeColor
import com.example.ejercicioscomposable.Exercice2.ContadorDeClics2
import com.example.ejercicioscomposable.Exercice2.EditorDeTextoConContador
import com.example.ejercicioscomposable.Exercice2.EspejoDeTexto
import com.example.ejercicioscomposable.Exercice2.FormularioSimple
import com.example.ejercicioscomposable.Exercice2.ListaDeTareas
import com.example.ejercicioscomposable.Exercice2.MensajeSecreto
import com.example.ejercicioscomposable.Exercice2.TarjetaExpandible
import com.example.ejercicioscomposable.ui.theme.EjerciciosComposableTheme
import com.example.ejercicioscomposable.ui.theme.Exercice1.PantallaLogin

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
            // PantallaLogin("jose","jose12")

*/

                // ejercicios de lesson
                Column  (modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                    ){
                    //ejercicio1 lesson2 ContadorDeClics()
                    // ejercicio 2 MensajeSecreto()
                   //  ejercicio 3 EspejoDeTexto()
                   // ejercicio 4  AppDeSaludos()
                   // ejercicio 5 ContadorDeClics2
                    // ejercicio 6   CambiadorDeColor()
                     // ejercicio 7 FormularioSimple()
                   // ejercicio 8 TarjetaExpandible()
                     // ejercicio 9 ListaDeTareas()
                    EditorDeTextoConContador()
                }

         }
        }
      }
    }


