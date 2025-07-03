package com.example.laboratorio.Exercice.Exercice2

fun main() {
    val exito = ResultadoAPI.Exito("DATOS EXITOSOS ")
    procesaResultado(exito)

    val error = ResultadoAPI.Error("DATOS ERRONEOS")
    procesaResultado(error)

    val cargandoo = ResultadoAPI.Cargando
    procesaResultado(cargandoo)

}

fun procesaResultado(resultado: ResultadoAPI){
    when (resultado){
        is ResultadoAPI.Exito -> println("exito")
        is ResultadoAPI.Error -> println("error")
        is  ResultadoAPI.Cargando -> println("cargando")
    }

}
