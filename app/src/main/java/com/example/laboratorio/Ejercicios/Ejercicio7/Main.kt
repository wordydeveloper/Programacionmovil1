package Ejercicios.Ejercicio7

fun main() {
    val perro = Perro("Perro")
    val pajaro = Pajaro("Pajaro")
    val gato = Gato("Gato")
    describirComportamiento(animal = perro)
    //agrego esto para dejarle espacios para mostrar mejor la impresion
    println()

     describirComportamiento(animal = pajaro)
    println()

    describirComportamiento(animal = gato)
}