package com.serverCode

fun main() {
    //val prova = listOf("Eliomar", "Alejandro", "Fiumma")

    val startTime = System.currentTimeMillis()

    println("CiaO CoME STaI?".swapCase())

    val endTime = System.currentTimeMillis()
    val totalTime = endTime - startTime

    println("La tua funzione ha impiegato $totalTime millisecondi.")
}