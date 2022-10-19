package ru.otus.hw_3

import ru.otus.utils.readIntInput
import java.util.stream.Collectors

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

    val triangleType = resolveTriangleType(diagonal, sides)

    println(triangleType.message)
}

fun findDiagonal(sides: List<Int>): Int {
    return sides.stream().collect(Collectors.summarizingInt(Int::toInt)).max
}