package ru.otus.hw_4

import ru.otus.utils.readIntInput

fun main() {
    println("Enter the number")
    val inputValue = readIntInput()

    println(drawTriangle(inputValue))
}

fun drawTriangle(input: Int): String {
    val sb = StringBuffer()

    for (i in 1..input) {
        sb.append(" ".repeat(input - i))
            .append("* ".repeat(i))
            .append('\n')
    }

    return sb.toString()
}