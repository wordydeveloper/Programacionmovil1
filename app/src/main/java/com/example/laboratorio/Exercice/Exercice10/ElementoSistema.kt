package com.example.laboratorio.Exercice.Exercice10

sealed class ElementoSistema(val nombre: String)


class Archivo(
    nombre: String,
    val tamañoKB: Int
) : ElementoSistema(nombre)

class Directorio(
    nombre: String,
    val contenidos: MutableList<ElementoSistema> = mutableListOf()
) : ElementoSistema(nombre)
