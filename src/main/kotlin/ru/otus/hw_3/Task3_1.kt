package ru.otus.hw_3

import ru.otus.utils.readInputDay
import ru.otus.utils.readInputMonth
import java.time.LocalDate

fun main() {
    println("Enter month number")

    val month = readInputMonth()
    val currentYear = LocalDate.now().year

    println("Enter day number")

    val day = readInputDay(month, currentYear)
    val inputDate = LocalDate.of(currentYear, month, day).toEpochDay()

    val newYearDate = LocalDate.of(currentYear + 1, 1, 1).toEpochDay()
    println(newYearDate - inputDate)
}