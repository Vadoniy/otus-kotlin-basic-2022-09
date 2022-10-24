package ru.otus.hw_5

import ru.otus.utils.readInputIntArray
import ru.otus.utils.squareNumber
import kotlin.math.sqrt

fun main() {
    println("Enter 2 numbers X1 X2 with a space")
    val inputX = readInputIntArray(2, 2)
    println("Enter 2 numbers Y1 Y2 with a space")
    val inputY = readInputIntArray(2, 2)

    println(countSegmentLength(inputX, inputY))
}

fun countSegmentLength(valuesX: List<Int>, valuesY: List<Int>): Double {
    return sqrt(squareNumber(valuesX[1] - valuesX[0]) + squareNumber(valuesY[1] - valuesY[0]))
}