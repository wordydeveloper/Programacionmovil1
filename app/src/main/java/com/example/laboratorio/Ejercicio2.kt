package com.example.laboratorio
import java.util.*

fun main (){
//ejercicio1
/*
        // Declaración de variables
        val userName: String? = "Wordy"
        val userEmail: String? = null
        val userBio: String? = ""

        // Impresión de datos
        println("Nombre: [${userName ?: "No proporcionado"}]")
        println("Correo electrónico: [${userEmail ?: "No disponible"}]")
        println("Bio: [${userBio?.takeIf { it.isNotEmpty() } ?: "El usuario no tiene biografía o está vacía"}]") */


 //ejercicio 2

    ejercicio2()
}
fun ejercicio2(){
    /*
    val tareaspendientes:  MutableList<String?> = mutableListOf("lavar","planchar",null)

    for (element in tareaspendientes ) {
        //print para pintar el nombre de la tarea y si es null el texto
        println(element ?: "[Sin descripción de la tarea] ")

        //primer elemento de la lista
        val primeraTarea= tareaspendientes.firstOrNull()
            println(
            if (primeraTarea != null) {
                "primeraTarea : ${primeraTarea ?: "sin descripcion de la tarea]"}"

            }else "no ahi tareas "
            )
        }

        println(tareaspendientes ?: "No hay tareas en la lista")*/


    ejercicio3()


    }



fun ejercicio3(){

/*
        val articulos = arrayOf("Laptop", "Mouse", "Teclado", "Monitor", "Silla")

        val precios = arrayOf(1200.0, 25.99, null, 250.0, null)

        val indice = 2 

        // Validar si el índice es válido
        if (indice in articulos.indices) {
            val nombreArticulo = articulos[indice]
            val precioArticulo = precios[indice]

            // Imprimir detalles del artículo
            println("Artículo: $nombreArticulo, Precio: ${precioArticulo?.let { "$$it" } ?: "No disponible"}")
        } else {
            println("Índice de elemento no válido")
        } */
    ejercicio4()

}
fun ejercicio4() {
/*
    var settingColorTheme: String? = null
    var settingFontSize: Int? = null

    // Simular carga (puedes cambiar estos valores para probar)
    settingColorTheme = "Oscuro"
    settingFontSize = null

    // Aplicar operador Elvis para obtener valores reales
    val actualColorTheme = settingColorTheme ?: "Luz"
    val actualFontSize = settingFontSize ?: 12


    println("Tema de aplicación: $actualColorTheme, Tamaño de fuente: ${actualFontSize}pt.")
    */
    ejercicio5()
}

fun ejercicio5() {

    val puntuaciones: List<Int?> = listOf(10, null, 8, null, 7, 9, null, 6)

    var suma = 0

    for (puntuacion in puntuaciones) {
        if (puntuacion != null) {
            println("Puntuación registrada: $puntuacion")
            suma += puntuacion
        } else {
            println("Intento fallido")
        }
    }

    println("Puntuación total de los intentos registrados: $suma")

    // BONUS: Crear nueva lista solo con valores no nulos
    val puntuacionesValidas = puntuaciones.filterNotNull()
    println("Puntuaciones registradas válidas: $puntuacionesValidas")
}



