package com.example.operacionesbasicas.Lession6

//6.5 practica
fun List<Int>.filterBy(condition: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (condition(item)) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    // Llamamos la extensión pasando la condición de divisibilidad por 3
    val divisibleBy3 = numbers.filterBy { it % 3 == 0 }

    println(divisibleBy3)
}
