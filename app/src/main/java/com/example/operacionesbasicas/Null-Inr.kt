package com.example.operacionesbasicas

fun main (){
    var nullTest :Int? = null

    val resultado = nullTest?.plus(1) ?:0
    println("El incremento es :$resultado")



}
