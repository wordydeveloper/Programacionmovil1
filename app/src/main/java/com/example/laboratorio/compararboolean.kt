package com.example.laboratorio

fun main (){

    //operadores de comparacion
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    /// operador para rangos
    val pescado =50
    if (pescado in 1.. 50){
        println(pescado)
    }

    var numero1=50
    var numero2=50
    var numero3=50
    if (numero1 >= numero2){
        println(" EL numero 1 es mayor o igual al numero 2")
    }else if (numero3 >90){
println("El numeros  3 es  mayor a 90")
    }else{
        println("Ninguna de las opciones anteriores es valida ")
    }
    //el when es considerado manera mas inteligente de hacer if else
when (numero1){
    0 -> println("El numero 1 es igual a 0")
     in 1..60-> println("El numero de la variable esta dentro de 1 y 60")
}
}
