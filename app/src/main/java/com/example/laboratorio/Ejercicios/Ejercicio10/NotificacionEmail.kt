package Ejercicios.Ejercicio10

class NotificacionEmail(  val codifo: Int=1323): Notificacion() {
    override fun enviar(){
        print("Notificacion email con numero de codigo $codifo ")
    }

}