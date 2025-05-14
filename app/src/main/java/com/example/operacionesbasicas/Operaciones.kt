package com.example.operacionesbasicas
import kotlin.math.roundToInt
fun main (){
    val pez1= 2
    val pez2=71
    val pez3 = 233
    val primeraProc= pez1 +pez2
    val segundaProc = primeraProc + pez3
    val  tragados = segundaProc - 13
    println("Los peces $tragados")
    println("Los peces por acuario son :${tragados/30}")
}