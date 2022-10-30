package ru.otus.hw_6

import ru.otus.utils.listPlusList
import ru.otus.utils.readInputLine

fun main() {
    println("Enter first array")
    val input1 = readInputLine()
    println("Enter second array")
    val input2 = readInputLine()

    println(listPlusList(input1.toList(), input2.toList()))
}
