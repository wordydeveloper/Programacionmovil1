package com.example.laboratorio.myapp



class Aquarium ( var length: Int = 100,  var width: Int = 20,  var height: Int = 40)  {
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm  ")

        // 1 liter = 1000 cm^3
        println("Volume: $volume liters")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        height = (tank / (length * width)).toInt()

    }

    init {
        println("aquarium initializing")

    }

    var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter
        set(value) {
            height = (value * 1000)/(width * length)
        }


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
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
//. Imprime el tamaño y el volumen.
    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
    aquarium6.volume = 70
    aquarium6.printSize()




}