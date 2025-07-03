package Ejercicios.Ejercicio2
import Ejercicios.Ejercicio2.Polimorfismo.Circulo
import Ejercicios.Ejercicio2.Polimorfismo.Cuadrado

class Polimorfismo {

    open class FiguraGeometrica(var nombre: String) {

        fun imprimirNombre() {
            println("Soy una figura $nombre")
        }

        open fun calcularArea(): Double = 0.0

    }

    class Circulo(var radio: Double, nombre: String) : FiguraGeometrica(nombre) {
        override fun calcularArea(): Double {
            return Math.PI * radio * radio
        }

    }

    class Cuadrado(var lado: Double, nombre: String) : FiguraGeometrica(nombre) {
        override fun calcularArea(): Double {
            return lado * lado
        }

    }


}

fun main() {
    val circulo = Circulo(12.00, "circulo")
    val cuadrado = Cuadrado(12.00, "cuadrado")
    circulo.imprimirNombre()
    val figuras: List<Polimorfismo.FiguraGeometrica> = listOf(cuadrado, circulo)
    for (figura in figuras) {
     figura.imprimirNombre()
        println("la figura calculada es ${figura.calcularArea()}")

    }

}