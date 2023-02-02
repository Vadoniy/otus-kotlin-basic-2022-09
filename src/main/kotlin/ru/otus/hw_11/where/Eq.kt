package ru.otus.hw_11.where

class Eq(private val column: String, private val value: Any?) : ComparisonOperator() {

    override fun addComparisonOperatorToQuery(comparisonOperator: ComparisonOperator) {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return when (value) {
            is String -> "$column = '$value'"
            null -> "$column is null"
            else -> "$column = $value"
        }
    }
}