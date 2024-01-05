package com.serverCode

fun main() {
    //val prova = listOf("Eliomar", "Alejandro", "Fiumma")

    val startTime = System.currentTimeMillis()

    println("Ciao".zFill(10))

    val endTime = System.currentTimeMillis()
    val totalTime = endTime - startTime

    println("La tua funzione ha impiegato $totalTime millisecondi.")
}