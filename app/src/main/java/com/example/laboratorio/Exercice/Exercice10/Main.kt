package com.example.laboratorio.Exercice.Exercice10


fun main() {

    val archivo1 = GestorArchivos.crearArchivo("documento.txt", 50)
    val archivo2 = GestorArchivos.crearArchivo("imagen.png", 200)
    val archivo3 = GestorArchivos.crearArchivo("video.mp4", 1000)


    val subDirectorio = GestorArchivos.crearDirectorio("SubCarpeta")
    subDirectorio.contenidos.add(archivo2)
    subDirectorio.contenidos.add(archivo3)

    val directorioRaiz = GestorArchivos.crearDirectorio("Raiz")
    directorioRaiz.contenidos.add(archivo1)
    directorioRaiz.contenidos.add(subDirectorio)

    val tamañoTotal = directorioRaiz.calcularTamañoTotal()
    println("El tamaño total del directorio raíz es: $tamañoTotal KB")
}
fun Directorio.calcularTamañoTotal(): Int {
    var total = 0
    for (elemento in contenidos) {
        when (elemento) {
            is Archivo -> total += elemento.tamañoKB
            is Directorio -> total += elemento.calcularTamañoTotal()
        }
    }
    return total
}
