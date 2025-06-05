package com.example.operacionesbasicas.Lession4
// 4.8 practica

open class Book(val title: String, val author: String) {

    private var currentPage = 0

    // Método para leer una página
    open fun readPage() {
        currentPage++
        println("Leyendo página $currentPage de \"$title\"")
    }
}

//  Subclase
class eBook(
    title: String,
    author: String,
    val format: String = "texto"
) : Book(title, author) {

    // En lugar de páginas, contamos palabras
    private var wordCount = 0

    // Sobreescribimos el método readPage
    override fun readPage() {
        wordCount += 250
        println("Leyendo eBook \"$title\" - palabras leídas: $wordCount")
    }
}


fun main() {
    // Libro físico
    val libroFisico = Book("Cien años de soledad", "Gabriel García Márquez")
    libroFisico.readPage()
    libroFisico.readPage()

    // Libro digital
    val libroDigital = eBook("1984", "George Orwell")
    libroDigital.readPage()
    libroDigital.readPage()
}
