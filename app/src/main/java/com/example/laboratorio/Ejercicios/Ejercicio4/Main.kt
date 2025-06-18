package Ejercicios.Ejercicio4

fun main(){
    //detalles de los productos
val producto1 = Producto("Producto1",321.21)
    println("Primer producto: ${producto1.codigo}, precio ${producto1.precio}")

    val producto2 = Producto("Producto2")
    println("Sedundo producto: ${producto2.codigo}, precio ${producto2.precio}")

    val producto3 = Producto()
    println("Tercer producto: ${producto3.codigo}, precio ${producto3.precio}")


}
