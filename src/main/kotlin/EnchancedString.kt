package com.serverCode

import java.util.HashMap
import kotlin.math.abs

/**
 * The text will be centered by adding a specified number of characters to the left and right, based on the given length.
 * @param length Length of characters to add.
 * @param character The character to add, by default, is the space.
 * @return The text centered using the specified number and chosen characters
 */
fun String.center(length: Int, character: Char = ' '): String {
    var characterFinal = ""

    for (i in 0 until length)
        characterFinal += character.toString()

    return characterFinal + this + characterFinal
}

/**
 * It counts the number of times the substring passed as a parameter appears within the main string, also allowing
 * adjustment of the starting point and indices as parameters for the search.
 * @param subString Substring to search within the main string.
 * @param startIndex Starting index of the search, default is zero.
 * @param endIndex Index where the search must end, default is the length of the main string.
 * @return The number of times the text appears in the main string.
 */
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

/**
 * Checks if the substring is at the end of the main string; it can also be adjusted by passing the start and end
 * indices for the search.
 * @param subString Substring to search within the main string.
 * @param startIndex Starting index of the search, default is zero.
 * @param endIndex Index where the search must end, default is the length - 1 of the main string.
 * @return "True" if the text is at the end, otherwise returns "False".
 */
fun String.endsWith(subString: String, startIndex: Int = 0, endIndex: Int = this.length - 1, ignoreCase: Boolean = false): Boolean{
    val newStringOptionalValues = StringBuilder()

    return if (startIndex >= 0 && endIndex <= this.length){
        for (i in startIndex .. endIndex)
            newStringOptionalValues.append(this[i])

        newStringOptionalValues.endsWith(subString, ignoreCase)
    }else
        false
}

/**
 * When it detects a '\t' in the string, it is replaced with spaces; the number of spaces will match the quantity
 * provided as a parameter.
 * @param tabSize
 */
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



/*
fun String.expandTabs(tabSize: Int): String {
    val spazziDaAggiungere = " ".repeat(tabSize - (this.length % tabSize))

    return this.replace("\t", spazziDaAggiungere)
}

 */




fun String.formatMap(map: HashMap<Any, Any>): String{
    val pattern = Regex(pattern = "\\{([^}]*)}")
    val matches = pattern.findAll(this)
    val resultsVar = matches.map { it.groupValues[1] }.toList()
    var stringFormatted = this
    var indexWithArray: List<String>

    for (variabile in resultsVar){
        if (variabile.contains("[") && variabile.contains("]")){
            indexWithArray = variabile.split(Regex("[\\[\\]]"))

            stringFormatted = stringFormatted.replace("{$variabile}", (map[indexWithArray[0]] as List<*>)[indexWithArray[1].toInt()].toString())

        }else {
            stringFormatted = stringFormatted.replace("{$variabile}", map[variabile].toString())
        }
    }

    return stringFormatted
}

fun String.isAlphaNum(): Boolean {
    return Regex(".*[a-zA-Z]+.*[0-9]+.*|.*[0-9]+.*[a-zA-Z]+.*").matches(this)
}

fun String.isAlpha(): Boolean {
    return Regex("^[a-zA-ZÀ-ú ]+\$").matches(this)
}

fun String.isAscii(): Boolean {
    return Regex("^\\p{ASCII}+\$").matches(this)
}

fun String.isDecimal(): Boolean {
    return try {
        this.toInt()
        true

    }catch (e: Exception){
        false
    }
}

fun String.isDigit(): Boolean {
    return Regex("^[\\p{Nd}²]+$").matches(this)
}

fun String.isIdentifier(): Boolean {
    return Regex("^[a-zA-Z_][a-zA-Z0-9_]*$").matches(this)
}

fun String.isLower(): Boolean {
    return Regex("^[^A-Z]*\$").matches(this)
}

fun String.isNumeric(): Boolean {
    return Regex("^[0-9²]*$").matches(this)
}

fun String.isPrintable(): Boolean {
    return Regex("^\\p{Print}*\$").matches(this)
}

fun String.isSpace(): Boolean {
    return !Regex("^[^ ]*\$").matches(this)
}

fun String.isTitle(): Boolean {
    return Regex("^([A-Z][\\w'’\\s,.!?]*\\w)[.!?]?$").matches(this)
}

fun String.isUpper(): Boolean {
    return Regex("^[^a-z]*$").matches(this)
}

fun String.join(listString: List<String>): String {
    val stringBuilder = StringBuilder()

    for ((contatore, stringa) in listString.withIndex()) {
        stringBuilder.append(if (contatore == listString.size || contatore == 0) stringa else this + stringa)

    }

    return stringBuilder.toString()
}

fun String.lJust(length: Int = this.length, character: String = " "): String {
    return if (length > this.length) this + character.repeat(abs(length - this.length)) else this
}

fun String.lStrip(characters: String = " "): String {
    val stringa = StringBuilder(this)

    while (characters.contains(stringa[0]))
        stringa.deleteCharAt(0)

    return stringa.toString()
}

fun String.partition(value: String): List<String> {
    val indexValue = this.indexOf(value)

    return if (indexValue == -1)
        listOf(this, "", "")

    else
        listOf(substring(0, indexValue), substring(indexValue, indexValue + (value.length -1)), substring(indexValue + (value.length), this.length))
}

fun String.rJust(length: Int = this.length, character: String = " "): String {
    return if (length > this.length) character.repeat(abs(length - this.length)) + this else this
}

fun String.rStrip(characters: String = " "): String {
    val stringa = StringBuilder(this)

    while (characters.contains(stringa[stringa.length - 1]))
        stringa.deleteCharAt(stringa.length - 1)

    return stringa.toString()
}

fun String.splitLines(): List<String> {
    return this.split("\n")
}

fun String.startWith(subString: String, startIndex: Int = 0, endIndex: Int = this.length - 1, ignoreCase: Boolean = false): Boolean{
    val newStringOptionalValues = StringBuilder()

    return if (startIndex >= 0 && endIndex <= this.length){
        for (i in startIndex .. endIndex)
            newStringOptionalValues.append(this[i])

        newStringOptionalValues.startsWith(subString, ignoreCase)
    }else
        false
}

fun String.sStrip(characters: String = " "): String {
    val stringa = StringBuilder(this)

    while (characters.contains(stringa[0]))
        stringa.deleteCharAt(0)

    while (characters.contains(stringa[stringa.length - 1]))
        stringa.deleteCharAt(stringa.length - 1)

    return stringa.toString()
}

fun String.swapCase(): String {
    val stringaCostruita = StringBuilder()

    return if (this.isLower())
        this.uppercase()

    else if (this.isUpper())
        this.lowercase()

    else {
        this.forEach { char ->

            if (char.isLowerCase())
                stringaCostruita.append(char.uppercase())

            else
                stringaCostruita.append(char.lowercase())
        }

        stringaCostruita.toString()
    }
}

fun String.capitalize(): String{
    return this.replaceFirstChar { char -> char.uppercase() }
}

fun String.title(): String {
    val stringaCostruita = StringBuilder(this)

    for (i in this.indices)
        if (this[i].isLetter()) {
            if (this[i].isLowerCase())
                stringaCostruita.setCharAt(i, this[i].uppercaseChar())
            break
        }

    return stringaCostruita.toString()
}

fun String.zFill(length: Int = this.length): String {
    val character = "0"

    return if (length > this.length) character.repeat(abs(length - this.length)) + this else this
}