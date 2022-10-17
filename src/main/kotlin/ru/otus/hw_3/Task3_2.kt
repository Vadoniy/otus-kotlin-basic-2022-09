package ru.otus.hw_3

import ru.otus.utils.readIntInput

fun main() {
    println("Enter number 0<X<100")
    val input = readIntInput(100)
    val romanianResult = intToRomanian(input)

    println(romanianResult)
}

fun intToRomanian(input: Int): String {
    val intAr = arrayListOf(1, 4, 5, 9, 10, 40, 50, 90)
    val romanNumbers = arrayListOf("I", "IV", "V", "IX", "X", "XL", "L", "XC")
    val sb = StringBuffer("")

    var i = intAr.size - 1
    var remainder = input

    while (remainder > 0) {

        val div = remainder / intAr[i]
        remainder %= intAr[i]

        for (j in 0 until div) {
            sb.append(romanNumbers[i])
        }

        i--
    }

    return sb.toString()
}