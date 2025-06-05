package com.example.operacionesbasicas.Lession5
//5.5 practica
fun main() {

    val allBooks = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "Othello")

    val library = mapOf("William Shakespeare" to allBooks)

    val containsHamlet = library.any { entry ->
        entry.value.contains("Hamlet")
    }
    println("¿Alguno de los libros es Hamlet? $containsHamlet")

    val moreBooks = mutableMapOf("The Great Gatsby" to "F. Scott Fitzgerald")

    val book = moreBooks.getOrPut("Moby Dick") { "Herman Melville" }

    println("Contenido de moreBooks:")
    moreBooks.forEach { (title, author) ->
        println("Título: $title - Autor: $author")
    }
}
