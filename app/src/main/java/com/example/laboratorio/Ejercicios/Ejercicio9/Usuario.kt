package Ejercicios.Ejercicio9

class Usuario( val username:String , val email:String ) {
    init {
      require(username.isNotBlank()){
          "el nombre no puede estar vacio"
      }

    }
    constructor(username: String):this(username,"$username@empresa.com"){
        require(email.contains("@")) { "El email no es valido" }

    }
}