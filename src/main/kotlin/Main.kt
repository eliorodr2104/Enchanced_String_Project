package com.serverCode

import java.util.ArrayList

fun main() {
    //val prova = listOf("Eliomar", "Alejandro", "Fiumma")
    val prova = ArrayList<Long>()

    var media = 0L

    for (i in 0 .. 10){
        val startTime = System.currentTimeMillis()

        println("ciao\tCiao\tciao".expandTabs(10))

        val endTime = System.currentTimeMillis()
        val totalTime = endTime - startTime

        prova.add(totalTime)
    }

    for (i in prova)
        media += i

    media /= prova.size

    println("La tua funzione ha impiegato $media millisecondi.")
}