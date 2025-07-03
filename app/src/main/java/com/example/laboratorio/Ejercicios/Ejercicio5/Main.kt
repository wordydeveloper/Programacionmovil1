package Ejercicios.Ejercicio5

fun main() {
 val listaAnimal: List<Animal>  = listOf(
 Perro("perro"),
 Gato("gato"),
 Pajaro("pajaro")
 )

 // iterando para imprimir el sonido y el movimeinto de cada animal
 for (animal in listaAnimal) {
  animal.moverse()
  animal.hacerSonido()
  println( "-------")
 }
}