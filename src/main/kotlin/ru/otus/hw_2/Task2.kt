package ru.otus.hw_2

import java.util.Scanner

fun main() {

    val daysInYear = 360
    val daysInMonth = 30

    println("Enter minutes")
    val input = Scanner(System.`in`)
    val minutes = input.nextInt()
    val days = minutes/(60*24)
    val months = days%daysInYear/daysInMonth
    val years = days/daysInYear

    println("$years $months")
}