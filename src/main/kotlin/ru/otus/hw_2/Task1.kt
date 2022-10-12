package ru.otus.hw_2

import java.util.Scanner

fun main() {
    println("Enter the number")

    val input = Scanner(System.`in`)
    val inputNumber = input.nextInt()
    var sum = 0
    var inputToDivide = inputNumber
    while (inputToDivide%10 != 0) {
        sum += inputToDivide%10
        inputToDivide /= 10
    }
    println(sum)
}