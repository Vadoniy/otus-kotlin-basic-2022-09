package ru.otus.hw_5

import ru.otus.utils.readInputIntArray

fun main() {
    println("Enter 4 numbers with a space")
    val inputList = readInputIntArray(4)

    println(inputList.min())
}