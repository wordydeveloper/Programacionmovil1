package Ejercicios.Ejercicio6

open class Vehiculo {

    open fun describir()= println("Este es un vehiculo Generico")
}
class Coche(): Vehiculo(){
    override fun describir(){
        super.describir()
       println("Más específicamente, un coche de 4 ruedas")
    }

}