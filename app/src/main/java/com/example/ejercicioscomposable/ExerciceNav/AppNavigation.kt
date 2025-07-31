package com.example.ejercicioscomposable.ExerciceNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppRoutes.BIENVENIDA
    ) {
        composable(AppRoutes.BIENVENIDA) {
            PantallaBienvenida(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.DATOSPERSONALES)
                }
            )
        }

        composable(AppRoutes.DATOSPERSONALES) {
            PantallaDatosPersonales(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.DATOSFINANCIEROS)
                }
            )
        }

        composable(AppRoutes.DATOSFINANCIEROS) {
            PantallaDatosFinancieros(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.CONFIRMACION)
                }
            )
        }

        composable(AppRoutes.CONFIRMACION) {
            PantallaConfirmacion(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.EXITO)
                }
            )
        }

        composable(AppRoutes.EXITO) {
            PantallaExito(
                onNavigateToHome = {
                    navController.popBackStack(AppRoutes.BIENVENIDA, inclusive = false)
                }
            )
        }
    }
}
