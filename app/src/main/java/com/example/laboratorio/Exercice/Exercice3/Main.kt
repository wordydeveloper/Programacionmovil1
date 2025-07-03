package com.example.laboratorio.Exercice.Exercice3

fun main() {
  for (prioridad in PrioridadTarea.values()){

      //esto se puede porque convertimos el variable de almacenar en string que tiene sus propieddades y luego llamamos la funcion
       println("la prioridad tiene nombre de ${prioridad.name} y su color${obtenerColor(prioridad)}")
  }

}
fun obtenerColor(prioridad:PrioridadTarea):String{
    return prioridad.colorHex
}