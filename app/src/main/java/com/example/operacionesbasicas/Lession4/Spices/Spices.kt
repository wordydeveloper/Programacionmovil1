package com.example.operacionesbasicas.Lession4.Spices

//4.10 practica
fun main() {
    val curry = Curry("Curry", "medium")
    println("Spice: ${curry.name}, Color: ${curry.color}, Spiciness: ${curry.spiciness}")
    curry.prepareSpice()
    curry.grind()
}

abstract class Spices(
    val name: String,
    val spiciness: String = "mild",
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}
