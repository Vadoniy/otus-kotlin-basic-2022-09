package ru.otus.hw_4

import ru.otus.utils.readIntInput

fun main() {
    println("Enter the number")
    val inputValue = readIntInput()

    println(factorial(inputValue))
}

fun factorial(input: Int): Int {
    if (input in 0..1) return 1
    return input * factorial(input - 1)
}