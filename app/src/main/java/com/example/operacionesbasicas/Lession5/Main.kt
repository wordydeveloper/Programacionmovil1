package com.example.operacionesbasicas.Lession5
//ejercicio 5.9
open class AquariumPlant(val color: String, val size: Int)


class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun main() {

    val frase = "Hola mundo"
    println("¿Tiene espacios?: ${frase.hasSpaces()}") // true


    val plantaRoja = AquariumPlant("red", 10)
    println("¿Es roja?: ${plantaRoja.isRed()}") // true


    val greenPlant = GreenLeafyPlant(25)
    greenPlant.print()

    val plantaComoPadre: AquariumPlant = greenPlant
    plantaComoPadre.print() // AquariumPlant

    // 4. Usar propiedad de extensión
    val plantaVerde = AquariumPlant("green", 15)
    println("¿Es verde?: ${plantaVerde.isGreen}") // true

    val plantaNula: AquariumPlant? = null
    val plantaAmarilla: AquariumPlant? = AquariumPlant("yellow", 20)

    plantaNula.pull()
    plantaAmarilla.pull()
}
