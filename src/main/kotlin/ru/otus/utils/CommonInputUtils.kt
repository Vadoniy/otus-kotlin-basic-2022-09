package ru.otus.utils

import java.time.LocalDate
import java.time.Year
import java.util.*

fun readIntInput(): Int {
    val scanner = Scanner(System.`in`)
    return scanner.nextInt()
}

fun readIntInput(limit: Int): Int {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()

    while (input >= limit) {
        println("Wrong input, value should be less than $limit")
        input = scanner.nextInt()
    }

    return input
}

fun readInputMonth(): Int {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()

    while (input < 1 || input > 12) {
        println("Wrong Month input, value should be from 1 to 12")
        input = scanner.nextInt()
    }

    return input
}

fun readInputDay(month: Int, year: Int): Int {
    val scanner = Scanner(System.`in`)
    var input = scanner.nextInt()
    val monthMaxLength = getMaxMonthLength(month, year)

    while (input < 1 || input > monthMaxLength) {
        println("Wrong Day input, value should be from 1 to $monthMaxLength")
        input = scanner.nextInt()
    }

    return input
}

fun readInputLine(): String {
    val scanner = Scanner(System.`in`)
    return scanner.nextLine()
}

fun readInputIntArray(
    minAmountOfElements: Int,
    maxAmountOfElements: Int = Int.MAX_VALUE,
    minElementValue: Int = Int.MIN_VALUE,
    maxElementValue: Int = Int.MAX_VALUE
): List<Int> {
    val input = readInputLine()
    val inputArray = "-?\\d+".toRegex().findAll(input)
        .map { it.value.toInt() }
        .toList()

    if (!validateAmountOfElements(inputArray, minAmountOfElements, maxAmountOfElements)
        || !validateElements(inputArray, minElementValue, maxElementValue)
    ) {
        return readInputIntArray(minAmountOfElements, maxAmountOfElements, minElementValue, maxElementValue)
    }

    return inputArray
}

fun validateAmountOfElements(inputArray: List<Any>, minAmountOfElements: Int, maxAmountOfElements: Int): Boolean {
    if (inputArray.size < minAmountOfElements || inputArray.size > maxAmountOfElements) {
        println(
            "Wrong input, please, enter not less than $minAmountOfElements and not more than " +
                    "$maxAmountOfElements numbers"
        )
        return false
    }
    return true
}

fun validateElements(elements: List<Int>, minElementValue: Int, maxElementValue: Int): Boolean {
    elements.forEach {
        if (it !in minElementValue + 1 until maxElementValue) {
            println("Input should be in range from $minElementValue to $maxElementValue: $it")
            return false
        }
    }

    return true
}

private fun getMaxMonthLength(month: Int, year: Int): Int {
    if (month == 2 && Year.isLeap(year.toLong())) {
        return LocalDate.of(year, month, 1).month.maxLength()
    } else if (month == 2) {
        return LocalDate.of(year, month, 1).month.maxLength() - 1
    }
    return LocalDate.of(year, month, 1).month.maxLength()
}