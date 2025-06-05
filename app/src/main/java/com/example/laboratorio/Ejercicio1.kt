package com.example.laboratorio

fun main() {


    //primer ejercicio
    var edad = 19
    if (edad < 18) {
        println("Menor")
    } else {
        println("adulto")
    }


// segundo ejercicio
    val calificacion = 67

    if (calificacion  in 90..100) {
        println("A")
    } else if (calificacion in 80..89) {
        println("B")
    } else if (calificacion in 70..79){
        println("C")

    }else{
        println("C" +" "+"usted se a quemado socio")
    }


//tercer ejercicio
    var color =  "azul"
    when(color){
       "Rojo" -> print("Alto")
        "Amarillo" -> print("Alto")
        "Verde " -> print("Alto")
else ->{
    println("Color de luz no válido")
}


    }

    //ejercicio 4
    val variable = 53
    if (variable%2==0){
println("Es par")
    }else{
println("Es impar")
    }

    //ejercicio5
    val savedUsername = "juan"
    val savedPassword ="1234"

    var enteredUsername= "juan"
    var enteredPassword = "1234"

    if (enteredUsername== savedUsername && enteredPassword==savedPassword) {
        println("Inicio de sesión exitoso")


    } else if (enteredUsername== savedUsername && enteredPassword!==savedPassword){
            println("Contraseña incorrecta")


        }else if  ( enteredPassword==savedPassword && enteredUsername!== savedUsername){
        println("nombre de usuario incorrecto")

        }




    //ejercicio 6
     val temperatura :Int = 2
    when(temperatura){
       in  0 .. Int.MIN_VALUE -> println("¡Congelación! Usa ropa muy abrigada")
        in 0..10  -> println("Usa una chaqueta abrigada")
         in 11..20  -> println("Genial. Una chaqueta ligera debería estar bien")
         in 21..30  -> println("¡Disfruta del clima!")
           in 30..Int.MAX_VALUE  -> println("¡Caliente! Mantente hidratado")
        else ->{
            println("emperatura fuera del rango típico")
        }
    }
//ejercicio 7
    var userName :String? = "alicia"
    if (userName != null){
        println("Hola $userName")
    }else{
        println("¡Hola, invitado!")
    }

    userName = null
    if (userName!=null){
        println("Hola $userName")
    }else{
        println("¡Hola, invitado!")
    }


    }

