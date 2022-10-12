package ru.otus.hw_2

import java.math.RoundingMode
import java.util.*
import kotlin.math.sqrt

fun main() {
    println("Enter A")

    val inputA = Scanner(System.`in`)
    val a = inputA.nextInt()

    println("Enter B")
    val inputB = Scanner(System.`in`)
    val b = inputB.nextInt()
    val diagonal = sqrt((a*a + b*b).toFloat()).toBigDecimal().setScale(3, RoundingMode.HALF_UP)

    println(diagonal)
}