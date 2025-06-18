package Ejercicios.Ejercicio3

open class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {
    init {
        println( "Se ha registrado un nuevo empleado $nombre")
    }
     open fun calcularSalario(): Double{
     return salarioBase
    }
}

class Gerente(nombre: String, edad: Int, salarioBase: Double, val bono: Double):Empleado(nombre,edad,salarioBase){
    override fun calcularSalario(): Double {
        return bono + salarioBase
    }
}

class Desarrollador(val lenguaje: String, nombre: String,edad: Int,salarioBase: Double): Empleado(nombre,edad,salarioBase){

}