package com.example.laboratorio.Exercice.Exercice1

fun main(){

}

fun comparar():Boolean{

    val libro1 = Libro("Juan salvador javiota", "jose ramires", "12")
    val libro2 = Libro("Juan salvador javiota", "jose ramires", "12")
     val  copiado =libro1.copy("ejercicio copiadom ")
    println(libro2.toString())
    println(libro1.toString())
    println(copiado)
    if (libro1 == libro2) {
        return true;
    } else {
       return false
    }

}