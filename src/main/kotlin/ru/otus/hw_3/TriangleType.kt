package ru.otus.hw_3

import ru.otus.utils.squareNumber
import java.util.stream.Collectors

enum class TriangleType(var message: String) {

    RIGHT("Right triangle"),

    OBTUSE("Obtuse triangle"),

    ACUTE("Acute triangle")

}

fun resolveTriangleType(diagonal: Int, sides: List<Int>): TriangleType {
    val diagonalSquare = squareNumber(diagonal)
    val sidesSum = sides.stream()
        .map { t -> squareNumber(t) }
        .collect(Collectors.summarizingDouble(Double::toDouble))
        .sum
    return when {
        diagonalSquare > sidesSum -> TriangleType.OBTUSE
        diagonalSquare < sidesSum -> TriangleType.ACUTE
        else -> TriangleType.RIGHT
    }
}