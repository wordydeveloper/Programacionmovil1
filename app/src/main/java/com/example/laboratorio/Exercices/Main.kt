package Exercices

import example.myapp.decor.makeDecorations

fun main() {
    buildAquarium()
    makeFish()
    makeDecorations()
}

fun buildAquarium() {
    val myAquarium = Aquarium(34)
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    //parte 3 otra forma de instanciar y modificar los atributos del objeto
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    //aquerio con otras longitudes
val aquarium3 = Aquarium(length = 25,width = 25, height = 40,)
    aquarium3.printSize()


        //llamand una sub clase
    val towerTank = TowerTank(25,40)
    towerTank.printSize()

}

fun makeFish(){
    val shark = Shark()
   // shark.color = "black"
    println("shart:${shark.color}")
    shark.eat()
    val plecostomus = Plecostomus()
    //plecostomus.color= "white"
    println("shart:${plecostomus.color}")
    plecostomus.eat()


}