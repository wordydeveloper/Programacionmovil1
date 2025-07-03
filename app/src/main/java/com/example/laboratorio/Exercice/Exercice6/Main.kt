package com.example.laboratorio.Exercice.Exercice6


//funciones de extencion
fun Int.esPar():Boolean{
    return this % 2== 0
}
fun Int.cuadrado():Int{
    return this * this
}
fun main() {
    val numeroPar = 10
    val numeroImpar = 5
    println("$numeroPar es par? ${numeroPar.esPar()}")
    println("el cuadrado de $numeroPar es ${numeroPar.cuadrado()}")

    println("$numeroImpar es par? ${numeroImpar.esPar()}")
    println("el cuadrado de $numeroImpar es ${numeroImpar.cuadrado()}")
}
