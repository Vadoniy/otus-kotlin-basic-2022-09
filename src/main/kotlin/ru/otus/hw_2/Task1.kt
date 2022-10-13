package ru.otus.hw_2

fun main() {
    println("Enter the number")

    val inputNumber = readIntInput()
    val result = sumDigits(inputNumber)
    println(result)
}

fun sumDigits(inputNumber: Int): Int {
    var sum = 0
    var inputToDivide = inputNumber

    while (inputToDivide % 10 != 0) {
        sum += inputToDivide % 10
        inputToDivide /= 10
    }

    return sum
}