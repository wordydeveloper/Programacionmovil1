package Ejercicios.Ejercicio8

 open class Publicacion( val titulo : String, val autor: String) {

}
class Libro(titulo: String, autor: String , val numeroPaginas: Int): Publicacion( titulo, autor) {

}
class ArticuloDeRevista(titulo: String, autor: String, val nombreRevista: String): Publicacion(titulo, autor) {

}