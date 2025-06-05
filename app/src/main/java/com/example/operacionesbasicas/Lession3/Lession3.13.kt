package com.example.operacionesbasicas.Lession3

fun main (){
    lista()
    //llamando la gamePlay y tomando de argumentos rollDice2
gamePlay(rollDice2)

    //parte del ejercicio 3.15
    println("¿Cómo te sientes hoy?")
    val mood = readLine() ?: "happy"

    println("¿Cómo está el clima? (sunny, rainy, cloudy)")
    val weather = readLine() ?: "sunny"

    println("¿Cuál es la temperatura actual?")
    val temperature = readLine()?.toIntOrNull() ?: 24

    val userData = listOf(mood,weather,temperature)
    println( "El conjunto de datos es $userData")

//impresion del ejercicio 3.19
println("Tirada con 12 lados : $rollDice    ")


    //3.13 ejercicio practico
    fun whatShouldIDoToday (mood:String,weather:String="sol",temperature:Int =24,){

        when( Triple(mood, weather ,temperature,)){
            Triple("happy" ,"sunny",24 ) -> println("go for a walk")
            Triple("sad" ,"Sunny",21 ) -> println("go for a walk")

            else ->  println("Stay home and read.")


        }

    }



//aqui la llamamos y ponemos sus argumentos 3.13
    whatShouldIDoToday("happy" ,"sunny",24)

}
//3.17 ejercicio practico

fun lista(){

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red pepper")

    // Filtrar todos los currys y ordenarlos por longitud
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    // Filtrar las especias que empiezan con 'c' y terminan en 'e' - Método 1
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })

    // Filtrar las especias que empiezan con 'c' y terminan en 'e' - Método 2 (Usando Regex)
    println(spices.filter { it.matches(Regex("^c.*e$")) })

    // Tomar los tres primeros elementos de la lista y devolver los que comienzan con 'c'
    println(spices.take(3).filter { it.startsWith('c') })

    //funciones landas 3.19

}
val rollDice :(Int)-> Int= { sides -> if (sides==0) 0 else(1..sides).random()}
//lambda utilizando la notación de tipo de función.
val rollDice2 :(Int)-> Int = rollDice

fun gamePlay(roll:(Int)->Int){
println("El resultado de dado es ${roll(12)}")
}