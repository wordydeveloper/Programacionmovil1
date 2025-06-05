package com.example.operacionesbasicas.Lession5
// 5.16 ejercicio

open class BaseBuildingMaterial1A {
    open val numberNeeded: Int = 1
}

// Subclase Wood1
class Wood1 : BaseBuildingMaterial1A() {
    override val numberNeeded: Int = 4
}

// Subclase Brick1
class Brick1 : BaseBuildingMaterial1A() {
    override val numberNeeded: Int = 8
}

class Building1<T : BaseBuildingMaterial1A>(private val material: T) {

    val baseMaterialsNeeded: Int = 100

    // materiales totales necesarios
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        val materialName = material::class.simpleName ?: "Material"
        println("$actualMaterialsNeeded unidades de $materialName requeridas.")
    }
}

// Función genérica para determinar si el edificio es pequeño o grande
fun <T : BaseBuildingMaterial1A> isSmallBuilding(building: Building1<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("pequeño edificio")
    } else {
        println("gran edificio")
    }
}

fun main() {
    val woodBuilding = Building1(Wood1())
    woodBuilding.build()  // Imprime: 400 unidades de Wood1 requeridas.
    isSmallBuilding(woodBuilding)  // Imprime: pequeño edificio

    val brickBuilding = Building1(Brick1())
    brickBuilding.build()  // Imprime: 800 unidades de Brick1 requeridas.
    isSmallBuilding(brickBuilding)  // Imprime: gran edificio
}
