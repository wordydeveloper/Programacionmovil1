package Ejercicios.Ejercicio10

fun main() {

        val notificacion: List<Notificacion> =listOf(
            NotificacionSMS("Juan","juan@correo.com"),
            NotificacionPush("8299159717"),
            NotificacionEmail()
        )
    fun enviarTodas(list: List<Notificacion>){
        for ( lista in list){
            lista.enviar()
            print("----")

        }


    }
    // me daba error al llamar la funcion dentro de su cuerpo
    enviarTodas(notificacion)
}

