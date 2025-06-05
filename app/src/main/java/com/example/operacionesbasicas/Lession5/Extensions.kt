package com.example.operacionesbasicas.Lession5

//ejercicio 5.9
fun String.hasSpaces() = contains(" ")


fun AquariumPlant.isRed() = color == "red"


val AquariumPlant.isGreen: Boolean
    get() = color == "green"


fun AquariumPlant.print() = println("AquariumPlant")

fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun AquariumPlant?.pull() {
    this?.apply {
        println("Removing $color plant")
    } ?: println("No plant to remove")
}
