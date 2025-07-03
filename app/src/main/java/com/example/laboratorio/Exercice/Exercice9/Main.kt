package com.example.laboratorio.Exercice.Exercice9

fun main() {

    val cajaStrin = Caja("azucar")
    val cajaInt = Caja(23)

    println("Contenido de cajaDeTexto: ${cajaStrin.obtenerContenido()}")
    println("¿cajaDeTexto está vacía? ${cajaStrin.estaVacia()}")

    println("Contenido de cajaDeEntero: ${cajaInt.obtenerContenido()}")
    println("¿cajaDeEntero está vacía? ${cajaInt.estaVacia()}")
}