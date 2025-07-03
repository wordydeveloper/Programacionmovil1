package com.example.laboratorio.Exercice.Exercice7

fun main() {
    val impresora = ImpresoraLaser()
    val escaner = EscanerDeCamaPlana()

    val multifuncional = Multifuncional(impresora, escaner)


    multifuncional.imprimir("Factura 2023")
    val resultadoEscaneo = multifuncional.escanear()
    println(resultadoEscaneo)
}