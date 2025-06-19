package Ejercicios.Ejercicio8

fun main() {
 val libro = Libro("Juan Salvador Javiota","Marcos",145)
     println("EL  titulo del libro es : ${libro.titulo} su autor es : ${libro.autor} , y tiene ${libro.numeroPaginas} paginas")
val articuloDeRevista = ArticuloDeRevista("Biblia","Jesus","People")
    println("EL  titulo del libro es : ${articuloDeRevista.titulo} su autor es : ${articuloDeRevista.autor} , y el nombre de la revista es  ${articuloDeRevista.nombreRevista} ")
}