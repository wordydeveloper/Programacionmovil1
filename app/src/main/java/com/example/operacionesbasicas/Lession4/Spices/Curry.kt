package com.example.operacionesbasicas.Lession4.Spices


class Curry(
    name: String,
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spices(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        println("Preparing $name by grinding it.")
    }

    override fun grind() {
        println("Grinding the $name spice.")
    }
}