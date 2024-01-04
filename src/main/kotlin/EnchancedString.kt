package com.serverCode

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