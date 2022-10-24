package ru.otus.hw_5

import ru.otus.utils.readInputLine

fun main() {
    println("Enter your password")
    val inputLine = readInputLine()
    val validationResultList = validatePassword(inputLine)

    if (validationResultList.isNotEmpty()) {
        validationResultList.forEach { println(it.message) }
    } else {
        println("Password is valid")
    }
}

fun validatePassword(inputLine: String): List<ValidationPatterns> {
    return ValidationPatterns.values().filter {
        !it.validateInput(inputLine)
    }.toList()
}