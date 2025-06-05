package com.example.operacionesbasicas.Lession4


//4.5 practica
class Spice(val name: String, val spiciness: String = "mild") {

    // Getter personalizado para el valor numérico del nivel de picante
    val heat: Int
        get() = when (spiciness.lowercase()) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extreme" -> 10
            else -> 0
        }

   
    init {
        println("Spice creada: name = $name, spiciness = $spiciness, heat = $heat")
    }
}

// Función helper para crear sal
fun makeSalt(): Spice {
    return Spice("Sal")
}

// Función main para probar todo
fun main() {
    // Lista de objetos Spice
    val listaDeEspecias = listOf(
        Spice("Curry", "mild"),
        Spice("Pimienta", "spicy"),
        Spice("Chile", "extreme"),
        Spice("Paprika", "medium"),
        Spice("Canela", "mild"),
        Spice("Jalapeño", "very spicy")
    )

    // Filtrar especias con heat <= 5 (suaves o moderadas)
    val especiasSuaves = listaDeEspecias.filter { it.heat <= 5 }

    println("\nEspecias suaves o moderadas:")
    for (spice in especiasSuaves) {
        println("${spice.name} (heat: ${spice.heat})")
    }

    // Crear sal con makeSalt
    val sal = makeSalt()
}
