package Ejercicios.Ejercicio10

class NotificacionSMS(val nombre: String , val email : String): Notificacion() {
    override fun enviar(){
        print(" Notificacion SMS a $nombre con correo $email \n ")
    }
}