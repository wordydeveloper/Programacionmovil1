package com.example.operacionesbasicas.Lession6

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {

    var path = mutableListOf(Direction.START)

    private var x = 0
    private var y = 0
    private val width = 4
    private val height = 4

    private val map = Array(width) { Array(height) { "Un lugar vacío" } }

    init {
        // Inicializar mapa con descripciones personalizadas
        map[0][0] = "Estás en el punto de inicio."
        map[0][1] = "Un campo con flores."
        map[0][2] = "Una cueva oscura."
        map[0][3] = "Un lago brillante."
        map[1][0] = "Un bosque denso."
        map[1][1] = "Una aldea misteriosa."
        map[1][2] = "Una montaña alta."
        map[1][3] = "Un templo antiguo."
        map[2][0] = "Un desierto caluroso."
        map[2][1] = "Una playa tranquila."
        map[2][2] = "Un castillo abandonado."
        map[2][3] = "Una torre mágica."
        map[3][0] = "Una zona helada."
        map[3][1] = "Un volcán activo."
        map[3][2] = "Una ciudad en ruinas."
        map[3][3] = "El final del mundo."
    }

    // Mostrar la ubicación actual del jugador
    private fun showLocation() {
        println("Ubicación actual: ${map[x][y]} (x=$x, y=$y)")
    }

    // Lambdas que actualizan la posición si no se sale del mapa
    val north = {
        if (y > 0) {
            y--
            path.add(Direction.NORTH)
            showLocation()
        } else {
            println("No puedes ir más al norte.")
        }
    }

    val south = {
        if (y < height - 1) {
            y++
            path.add(Direction.SOUTH)
            showLocation()
        } else {
            println("No puedes ir más al sur.")
        }
    }

    val east = {
        if (x < width - 1) {
            x++
            path.add(Direction.EAST)
            showLocation()
        } else {
            println("No puedes ir más al este.")
        }
    }

    val west = {
        if (x > 0) {
            x--
            path.add(Direction.WEST)
            showLocation()
        } else {
            println("No puedes ir más al oeste.")
        }
    }

    // Finalizar el juego
    val end: () -> Boolean = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    // Función de orden superior
    fun move(where: () -> Boolean): Boolean {
        return where()
    }

    // Decidir qué movimiento hacer
    fun makeMove(input: String?): Boolean {
        return when (input?.lowercase()) {
            "n" -> move { north(); true }
            "s" -> move { south(); true }
            "e" -> move { east(); true }
            "w" -> move { west(); true }
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()

    println("¡Bienvenido al juego de direcciones!")
    println("Estás en el punto de partida. Usa n/s/e/w para moverte o cualquier otra cosa para salir.\n")

    while (true) {
        print("Enter a direction (n/s/e/w): ")
        val input = readLine()
        val continuar = game.makeMove(input)
        if (!continuar) break
    }
}
