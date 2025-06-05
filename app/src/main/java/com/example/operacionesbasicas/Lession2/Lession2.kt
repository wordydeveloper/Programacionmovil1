package com.example.operacionesbasicas.Lession2

fun main (){
    //parte uno
    val pez1= 2
    val pez2=71
    val pez3 = 233
    val primeraProc= pez1 +pez2
    val segundaProc = primeraProc + pez3
    val  tragados = segundaProc - 13
    println("Los peces $tragados")
    println("Los peces por acuario son :${tragados/30}")
//parte 2
    fun color() {
        var color = "Color Blue"
        color = "color rojo"
        print(color)


        // valor que no se puede cambiar
        val blackColor = " green"
        /*  maneras
        blackColor ="red"
        blackColor.toString("red")
        */
        //
        //valor null

//parte 3
    var rainbowColor = null

    var greenColor:String?=null

    var blueColor :String?
    blueColor=null

    println(blueColor)



    //parte 4
    //lista nula
    val lista1 :List<String>?=null

    println(lista1)
    val lista2:List<String?> = listOf (null, null)
    println(lista2)




//    Crear tres variables de cuerda para trout, haddock, y snapper.
    var variable1 ="trout"
    var variable2 ="haddock"
    var variable3 ="snapper"

    println(  " No me gusta $variable1   me gusta , $variable2  no me gusta ,  $variable3")


//when declaraciones en Kotlin son como case o o switch declaraciones en otros idiomas.
    val fishName = "Wordy"
    when(fishName.length){
        0 -> println("Error")
        in 3..12 -> println("Good Fish name ")
        else -> println(" Ok fish name")

}
    //parte 5
    var nullTest :Int? = null

    val resultado = nullTest?.plus(1) ?:0
    println("El incremento es :$resultado")


    //parte 6 bucle de arrays
    fun desafio (){

        //array del 11 al 15
        val array= Array(5){it+11}
        println(array.asList(  ))

        //lista mutable string vacia
        var Lista = listOf("")
        print(Lista)

        //ejemplo de desafio
        val Lista2  = mutableListOf <Int>()
        for ( i in 0..100 step 7){
            Lista2.add(i)
        }
        println(Lista2)


    }
    desafio ()

}

    color()
}