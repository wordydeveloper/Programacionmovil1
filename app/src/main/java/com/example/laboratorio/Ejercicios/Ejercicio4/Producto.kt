package Ejercicios.Ejercicio4

class Producto(val codigo: String, val precio: Double) {


    init {
        if (precio <= 0) {
            throw IllegalArgumentException("El precio no puede ser menor que 1")
        }
    }

    constructor(codigo: String): this(codigo, 9.99)
    constructor(): this("GEN-001",0.99)
}
