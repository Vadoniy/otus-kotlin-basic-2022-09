package ru.otus.hw_2

import ru.otus.utils.readIntInput
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.sqrt

fun main() {
    println("Enter A")

    val a = readIntInput()

    println("Enter B")

    val b = readIntInput()
    val diagonal = calculateDiagonal(a, b)

    println(diagonal)
}

fun calculateDiagonal(squareSideA: Int, squareSideB: Int): BigDecimal {
    return sqrt((squareSideA * squareSideA + squareSideB * squareSideB).toFloat()).toBigDecimal()
        .setScale(3, RoundingMode.HALF_UP)
}