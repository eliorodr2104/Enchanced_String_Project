package com.serverCode

import java.util.HashMap

fun String.center(length: Int, character: Char = ' '): String {
    var characterFinal = ""

    for (i in 0 until length)
        characterFinal += character.toString()

    return characterFinal + this + characterFinal
}

fun String.count(subString: String, startIndex: Int = 0, endIndex: Int = this.length): Int{
    var count = 0
    var lastIndex = startIndex

    while (lastIndex in startIndex until endIndex) {
        lastIndex = this.indexOf(subString, lastIndex)
        if (lastIndex != -1 && lastIndex < endIndex) {
            count++
            lastIndex += subString.length

        } else {
            break
        }
    }
    return count
}

fun String.endsWith(subString: String, startIndex: Int = 0, endIndex: Int = this.length, ignoreCase: Boolean = false): Boolean{
    val newStringOptionalValues = StringBuilder()

    return if (startIndex >= 0 && endIndex <= this.length){
        for (i in startIndex .. endIndex)
            newStringOptionalValues.append(this[i])

        newStringOptionalValues.endsWith(subString, ignoreCase)
    }else
        false

}

fun String.expandTabs(tabSize: Int): String {
    val result = StringBuilder()
    var column = 0

    this.forEach { char ->
        when {
            char == '\t' -> {
                val spacesToAdd = tabSize - (column % tabSize)
                result.append(" ".repeat(spacesToAdd))
                column += spacesToAdd
            }
            else -> {
                result.append(char)
                column++
            }
        }
    }

    return result.toString()
}


fun String.formatMap(map: HashMap<Any, Any>): String{
    val pattern = Regex(pattern = "\\{([^}]*)}")
    val matches = pattern.findAll(this)
    val resultsVar = matches.map { it.groupValues[1] }.toList()
    var stringFormatted = this

    for (variabile in resultsVar){
        stringFormatted = stringFormatted.replace("{$variabile}", map[variabile].toString())
    }

    return stringFormatted
}