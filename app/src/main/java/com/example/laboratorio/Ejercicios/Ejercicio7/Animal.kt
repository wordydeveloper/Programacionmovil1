package Ejercicios.Ejercicio7

// nuestra clase que tiene los dos metodos
abstract  class  Animal (val nombre:String){
    abstract fun hacerSonido()
    abstract fun moverse()
}

//sobrescribir los metodos de la clase abstracta en las tres clases
class Perro(nombre: String):Animal(nombre){
    override fun hacerSonido() {
        println("El ${nombre} ladra")
    }
    override fun moverse() {
        println("El $nombre  corre")
    }
}


class Gato(nombre: String):Animal(nombre){
    override fun hacerSonido() {
        println("${nombre} miau")
    }
    override fun moverse() {
        println("${nombre} trepa")
    }

}
class Pajaro(nombre: String):Animal(nombre){
    override fun moverse() {
        println("${nombre} vuela")

    }

    override fun hacerSonido() {
        println("${nombre} silba")
    }
}
// me daba error porque animal solo aceptaba el parametro de gato
fun describirComportamiento(animal: Animal) {
    when(animal){
        is Pajaro -> print("Este animal vuela alto.")
        is  Perro -> print("Este animal es el mejor amigo del hombre")
        else -> print("Este animal tiene un comportamiento interesante.")
    }
}