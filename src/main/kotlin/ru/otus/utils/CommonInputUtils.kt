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

fun readInputIntArray(min: Int, max: Int = Int.MAX_VALUE): List<Int> {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val inputArray = input.split(' ').map { it.toInt() }

    if (inputArray.size < min || inputArray.size > max) {
        println("Wrong input, please, enter not less than $min and not more than $max numbers")
        return readInputIntArray(min)
    }

    return inputArray
}

private fun getMaxMonthLength(month: Int, year: Int): Int {
    if (month == 2 && Year.isLeap(year.toLong())) {
        return LocalDate.of(year, month, 1).month.maxLength()
    } else if (month == 2) {
        return LocalDate.of(year, month, 1).month.maxLength() - 1
    }
    return LocalDate.of(year, month, 1).month.maxLength()
}