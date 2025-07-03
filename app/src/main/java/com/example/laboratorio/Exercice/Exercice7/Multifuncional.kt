package com.example.laboratorio.Exercice.Exercice7

class Multifuncional(
    private val impresora: Impresora,
    private val escaner: Escaner
) : Impresora by impresora, Escaner by escaner
