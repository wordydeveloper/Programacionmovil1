package com.example.operacionesbasicas.Lession5

// 5.3 práctica y 5.7
class Book(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BOOKS
    }

    fun printUrl() {
        println("${BASE_URL}${title.replace(" ", "_")}.html")
    }

    companion object {
        private const val BASE_URL = "https://biblioteca.org/catalogo/"
        const val MAX_BOOKS = 5
    }
}

fun canBorrow(currentlyBorrowed: Int): Boolean {
    return currentlyBorrowed < Book.MAX_BOOKS
}

fun main(args: Array<String>) {
    val book = Book("Romeon and Juliet", "William Shakespeare", 1597)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    println("Can borrow more? ${book.canBorrow(3)}")
    book.printUrl()
}
