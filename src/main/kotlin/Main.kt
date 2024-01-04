package com.serverCode

fun main() {

    val prova = "ciao lei ha un, nome, mi chiamo: {nome}, e ho {eta} anni."

    val map: HashMap<Any, Any> = hashMapOf("nome" to "Eliomar", "eta" to 19)

    println(prova.formatMap(map))
}