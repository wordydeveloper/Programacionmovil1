package com.example.operacionesbasicas.Lession4


//4.3 practica
class SimpleSpice {
    val name:String ="Curly"
        val spiciness  :String ="mild"

    val heat: Int
        get()=when(spiciness){
                "mild"-> 5
                else -> 0
    }
}
    fun main(){
        val spice = SimpleSpice()
        println("Nombre: ${spice.name}")
        println("Heat: ${spice.heat}")


}
