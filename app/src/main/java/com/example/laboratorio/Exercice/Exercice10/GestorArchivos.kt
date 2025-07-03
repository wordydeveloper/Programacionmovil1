package com.example.laboratorio.Exercice.Exercice10

object GestorArchivos {
    fun crearArchivo(nombre: String, tamañoKB: Int): Archivo {
        return Archivo(nombre, tamañoKB)
    }

    fun crearDirectorio(nombre: String): Directorio {
        return Directorio(nombre)
    }
}