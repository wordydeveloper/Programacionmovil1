package com.example.operacionesbasicas.Lession3
import java.util.Calendar

//tarea 1 hacer una funcion con helloworld
fun main (){
    fun helloworld (){
        println("Hola mundo")
    }
    helloworld()
    dayOfWeek()
print(getFortuneCookie())//para llamar y imprimir la funcion


    for(i in 1..10  ){
val fortune = getFortuneCookie()
        println("Intento $i: tu fortura es $fortune?")

        if (fortune =="Treasure a tus amigos porque son tu mayor fortuna"){
            println("a sido selecionada")
            break

        }

    }


}



// tarea 2 hacer una funcion solicintando los dias y llamarla desde la funcion main
fun dayOfWeek (){
    //parte de la tarea 1 imprimir desde esta funcion que dia es hoy
println("Que dia es hoy")


    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val Dayname =  when(day){
       Calendar.SUNDAY -> ("Domingo")
       Calendar.MONDAY -> ("Lunes")
       Calendar.TUESDAY -> ("Martes")
       Calendar.WEDNESDAY -> ("Miercoles")
       Calendar.THURSDAY -> ("Jueves")
       Calendar.FRIDAY -> ("Viernes")
       Calendar.SATURDAY -> ("Sabado")
       else -> print("Dia desconocido")

   }
    println("Hoy es $Dayname")

        main1(arrayOf("10")) // Llamamos a main1() con un argumento
    }


///
fun getFortuneCookie(): String {
    val fortunes = listOf(
        "Tendrás un gran día",
        "Las cosas te irá bien hoy",
        "Disfruta de un maravilloso día de éxito",
        "Sé humilde y todo saldrá bien",
        "Hoy es un buen día para ejercer moderación",
        "Tómalo fácil y disfruta de la vida",
        "Treasure a tus amigos porque son tu mayor fortuna"
    )


   // print("Introduce tu cumpleaños")
    val birthday= readLine()?.toIntOrNull() ?:1
    return fortunes[birthday / fortunes.size] // Selecciona un mensaje aleatorio de la lista


}





//saludos kotlin
    fun main1(args: Array<String>) {
        if (args[0].toInt() < 12) println("Good morning, Kotlin")
        else println("Good night, Kotlin")
   println(getBirthday ())



    val birthday = getBirthday()
    val fortune = getFortune(birthday!!)
    println("Tu fortuna es $fortune")
    getFortune(12)




    }

//3.9 practica

fun getBirthday(): Int? {
    println("Introduce tu cumpleaños nuevamente")
    return readLine()?.toIntOrNull()
}

fun getFortune(birthday: Int): String {
    return when (birthday) {
        in 28..31 -> "Eres todo un viejo"
        in 1..7 -> "Tendrás un gran comienzo de mes"
        else -> "La suerte está de tu lado"
    }
}


