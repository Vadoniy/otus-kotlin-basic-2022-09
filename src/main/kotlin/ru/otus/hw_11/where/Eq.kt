package ru.otus.hw_11.where

class Eq(private val column: String, private val value: Any?) : ComparisonOperator {

    override val comparisonOperatorList: MutableList<ComparisonOperator> = ArrayList(0)

    override fun toString(): String {
        return when (value) {
            is String -> "$column = '$value'"
            null -> "$column is null"
            else -> "$column = $value"
        }
    }
}