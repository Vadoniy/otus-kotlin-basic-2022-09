package ru.otus.hw_4

import ru.otus.utils.readInputLine

fun main() {
    println("Enter the number")
    val inputValue = readInputLine()

    println(isPalindrome(inputValue))
}

fun isPalindrome(inputValue: String): Boolean {
    for (i in 1..inputValue.length / 2) {
        if (inputValue[i - 1] != inputValue[inputValue.length - i]) return false
    }

    return true
}