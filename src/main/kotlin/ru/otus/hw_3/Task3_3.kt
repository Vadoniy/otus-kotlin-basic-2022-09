package ru.otus.hw_3

import ru.otus.utils.readIntInput
import java.util.stream.Collectors
import kotlin.math.pow

fun main() {
    println("Enter side A")
    val a = readIntInput()
    println("Enter side B")
    val b = readIntInput()
    println("Enter side C")
    val c = readIntInput()
    val sides = arrayListOf(a, b, c)
    val diagonal = findDiagonal(sides)

    sides.remove(diagonal)

    when {
        squareNumber(diagonal) == squareNumber(sides[0]) + squareNumber(sides[1]) -> println("Right triangle")
        squareNumber(diagonal) > squareNumber(sides[0]) + squareNumber(sides[1]) -> println("Obtuse triangle")
        squareNumber(diagonal) < squareNumber(sides[0]) + squareNumber(sides[1]) -> println("Acute triangle")
    }

}

fun findDiagonal(sides: List<Int>): Int {
    return sides.stream().collect(Collectors.summarizingInt(Int::toInt)).max
}

fun squareNumber(input: Int): Double {
    return input.toDouble().pow(2)
}