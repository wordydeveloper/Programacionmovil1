package com.example.operacionesbasicas.Lession4.Spices

//4.12 practica
open class Spice(val name: String, val spiciness: String = "mild")


data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

// Función principal
fun main() {
    val spice1 = Spice("Curry", "hot")
    val spice2 = Spice("Paprika", "mild")
    val spice3 = Spice("Turmeric", "medium")

    val container1 = SpiceContainer(spice1)
    val container2 = SpiceContainer(spice2)
    val container3 = SpiceContainer(spice3)

    val containers = listOf(container1, container2, container3)

    for (container in containers) {
        println("Etiqueta: ${container.label}")
    }
}