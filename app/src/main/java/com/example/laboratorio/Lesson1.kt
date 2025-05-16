package com.example.laboratorio

fun main(){
    //operaciones basicas
    println(1+1)
    println(53-3)
    println(50/10)
    println(1.0/2.0)
    println(2.0*3.5)
    println(6*50)
    println(6.0*50.0)
    println(6.0*50)
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

    //Step 2: Practice using types
    val i :Int =6
    val b1=i.toByte()
    println(b1)

    val b2:Byte=1
    println(b2)



//aqui comvertimos el tipo byte en tipo Int para poder operar
    val i4:Int =b2.toInt()
    println(i4)


    // aqui tambien convertimos el tipo de dato
    val i5: String = b2.toString()
    println(i5)


    val i6: Double = b2.toDouble()
    println(i6)

    /* daria error porque el tipo de dato no es compatible  val i1:Int =b2*/


/* lo mismo por aqui un double y un string
    val i2: String = b2


    val i3: Double = b2
   */


    // variables mutables e inmutables
    val fish ="pescado"
    // fish ="carne" nos dara un error porque la variable tipo val no es mutable

    var fish2:Int=12
    fish2=13
    println(fish2)

    var lakes: Double=2.5
    // para poder operar debo cambiar el tipo de dato
    var fish3: Double = fish2.toDouble()
    println("esta variable esta cambiando su tipo de dato $fish3")


    val numberOfFish = 5
    val numberOfPlants = 12

    // aqui imprimiendo tambien podemos llamar variables
 println(
   "I have $numberOfFish fish" + " and $numberOfPlants plants"
    )










}
