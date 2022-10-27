package ru.otus.hw_5

import ru.otus.utils.readInputIntArray
import ru.otus.utils.squareNumber
import kotlin.math.sqrt

fun main() {
    val minInputValue = -10000
    val maxInputValue = 10000
    val minAmountOfElements = 2
    val maxAmountOfElements = 2
    println("Enter 2 numbers X1 X2 with a space")
    val inputX = readInputIntArray(minAmountOfElements, maxAmountOfElements, minInputValue, maxInputValue)
    println("Enter 2 numbers Y1 Y2 with a space")
    val inputY = readInputIntArray(minAmountOfElements, maxAmountOfElements, minInputValue, maxInputValue)

    println(countSegmentLength(inputX, inputY))
}

fun countSegmentLength(valuesX: List<Int>, valuesY: List<Int>): Double {
    return sqrt(squareNumber(valuesX[1] - valuesX[0]) + squareNumber(valuesY[1] - valuesY[0]))
}