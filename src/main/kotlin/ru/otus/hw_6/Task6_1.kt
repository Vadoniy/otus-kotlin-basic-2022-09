package ru.otus.hw_6

import ru.otus.utils.readInputIntArray
import ru.otus.utils.readIntInput

fun main() {
    val maxElementValue = 10000
    println("Enter amount of elements")
    val amountOfElements = readIntInput()
    println("Entter elements separated with spaces")
    val array = readInputIntArray(
        minAmountOfElements = amountOfElements,
        maxAmountOfElements = amountOfElements,
        maxElementValue = maxElementValue
    )
    println(array.asSequence().sorted().joinToString(" "))
}