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

//variables nulas

  //  var rocks: Int = null nos dara un error
    var marbles :Int ?= null

//forma larga
      var fishFoodTreats=6
    if (fishFoodTreats !=null){
        fishFoodTreats = fishFoodTreats.dec()
        println(fishFoodTreats)
    }
//forma corta
    var fishFoodTreatsd:Int? = 6
    fishFoodTreatsd = fishFoodTreatsd?.dec()?:0
    println(fishFoodTreatsd)

    //manejo de errores
    var s = ""
    var len = s!!.length   // throws NullPointerException if s is null
    println(len)

    //listas
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    //lista para poder poder modificar sus valores
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    //array
    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    //arrays para todo tipo de datos
    val mix = arrayOf("fish", 2)
    //array que solo soporta un tipo de dato
    val numbers = intArrayOf(1,2,3)

// Usando una matriz de un tipo primitivo como Into o Byte  evita la cabeza del boxeo
    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
// mas listas combinadas
    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers4, oceans, "salmon")
    println(oddList)
//iniciar arrays
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    //iterar
    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element )

        //acceder a su posicion
        for ((index, element) in school.withIndex()) {
            println("Item at $index is $element\n")

            //for

            for (i in 1..5) print(i)


            for (i in 5 downTo 1) print(i)


            for (i in 3..6 step 2) print(i)


            for (i in 'd'..'g') print (i)




    //algunos bucles
            var bubbles = 0
            while (bubbles < 50) {
                bubbles++
            }
            println("$bubbles bubbles in the water\n")

            do {
                bubbles--
            } while (bubbles > 50)
            println("$bubbles bubbles in the water\n")

            repeat(2) {
                println("A fish is swimming")
            }



        }

    }








}
