package com.example.operacionesbasicas.Lession5

// 5.11 practica
open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

// Subclase
class Wood : BaseBuildingMaterial() {
    override val numberNeeded: Int = 4
}

// Subclase
class Brick : BaseBuildingMaterial() {
    override val numberNeeded: Int = 8
}

// Clase genérica
class Building<T : BaseBuildingMaterial>(private val material: T) {

    val baseMaterialsNeeded: Int = 100

    // Calcular materiales totales necesarios
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        // Obtener el nombre
        val materialName = material::class.simpleName ?: "Material"
        println("$actualMaterialsNeeded unidades de $materialName requeridas.")
    }
}


fun main() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    val brickBuilding = Building(Brick())
    brickBuilding.build()
}
