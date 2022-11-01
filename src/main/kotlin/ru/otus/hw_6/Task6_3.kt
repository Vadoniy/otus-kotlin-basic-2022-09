package ru.otus.hw_6

import ru.otus.utils.readInputIntArray

fun main() {
    println("Enter array with at least on number")
    val input = readInputIntArray(1)
    val result = mutableListOf<Int>()

    result.add(input.min())
    result.add(input.average().toInt())
    result.add(input.max())

    println(result.joinToString(" "))
}