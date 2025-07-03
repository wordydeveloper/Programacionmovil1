package Ejercicios.Ejercicio1

open class FiguraGeometrica( var nombre: String) {

    fun imprimirNombre(){
        print("Soy una figura $nombre")
    }

}

class Circulo(radio: Double):FiguraGeometrica("luis"){

}

class Cuadrado(lado: Double):FiguraGeometrica("cuadrado"){


}
fun main (){
    val circulo= Circulo(12.00)
    val cuadrado = Cuadrado(12.00)
    circulo.imprimirNombre()
    circulo.imprimirNombre()


}