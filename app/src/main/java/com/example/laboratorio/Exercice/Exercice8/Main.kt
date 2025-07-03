package com.example.laboratorio.Exercice.Exercice8

fun main() {

    //doble
    val (x,y) = obtenerCoordenadas()
    println("la cordenada x es :$x")
    println("la cordenada y es :$y")
//triple
    val (nombre,edad,estado)= obtenerDatosUsuario()
    println("el nombre es :$nombre")
    println("la edad es: $edad")
    println("estado $estado")
}



fun obtenerCoordenadas():Pair<Int,Int>{
return Pair(23,32)
}

fun obtenerDatosUsuario():Triple<String,Int,Boolean>{
return Triple("jose", 33,true)
}