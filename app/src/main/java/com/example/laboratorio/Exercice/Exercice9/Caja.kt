package com.example.laboratorio.Exercice.Exercice9

class Caja<T>(val contenido:T?){
    fun obtenerContenido():T?{
        return contenido

    }
    fun estaVacia():Boolean{
return contenido==null
    }
}
