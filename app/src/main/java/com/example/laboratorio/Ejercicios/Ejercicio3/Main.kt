package Ejercicios.Ejercicio3

fun main(){
val Gerente = Gerente("gerente",23,12.00,300.24)
 val Desarrollador = Desarrollador("kotlin","desarrollador",34,390.00)
     val salarioCalculadoGerente = Gerente.calcularSalario()
    val salarioCalculadoDesarrollador =Desarrollador.calcularSalario()
    println("El salario calculado de  ${Gerente.nombre} es $salarioCalculadoGerente")
    println("El salario calculado de  ${Desarrollador.nombre} es $salarioCalculadoDesarrollador")

}