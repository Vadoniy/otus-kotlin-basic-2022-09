package ru.otus.hw_6

import ru.otus.utils.listMinusList
import ru.otus.utils.readInputLine

fun main() {
    println("Enter first array to")
    val input1 = readInputLine()
    println("Enter second array")
    val input2 = readInputLine()

    println(listMinusList(input1.toList(), input2.toList()))
}