package Ejercicios.Ejercicio10

class NotificacionPush(val numero: String
): Notificacion() {
    override fun enviar(){
        print("Notificacion push  a $numero")
    }
}