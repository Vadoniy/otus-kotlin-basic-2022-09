package ru.otus.hw_2

import ru.otus.utils.readIntInput

fun main() {

    val daysInYear = 360
    val daysInMonth = 30

    println("Enter minutes")

    val minutes = readIntInput()
    val days = minutes / (60 * 24)
    val months = days % daysInYear / daysInMonth
    val years = days / daysInYear

    println("$years $months")
}