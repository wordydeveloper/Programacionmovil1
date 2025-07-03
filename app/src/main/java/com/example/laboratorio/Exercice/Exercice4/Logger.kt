package com.example.laboratorio.Exercice.Exercice4

object Logger {
    private val logs = mutableListOf<String>()

    fun log(mensaje: String) {
        logs.add(mensaje)
        println(mensaje)
    }
    fun mostrarLogs(){
        println("Los mensajes son : $logs")
    }
}