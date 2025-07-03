package com.example.laboratorio.Exercice.Exercice5

class Usuario private constructor(val email: String) {

    companion object {
        // Función que valida y crea el usuario
        fun crearDesdeEmail(email: String): Usuario? {
            return if ("@" in email) {
                Usuario(email)
            } else {
                null
            }
        }
    }
}
fun main() {
    val usuarioconemail1 = Usuario.crearDesdeEmail("wordymarte@gmail.com")
    if (usuarioconemail1 != null) {
        println("Usuario con email válido: ${usuarioconemail1.email}")
    } else {
        println("Email válido incorrecto.")
    }

    val usuariosinemail2 = Usuario.crearDesdeEmail("wordymartegmail.com")
    if (usuariosinemail2 != null) {
        println("Usuario con email inválido: ${usuariosinemail2.email}")
    } else {
        println("Email inválido ")
    }
}
