package ru.otus.hw_11.where

interface ComparisonOperator {

    val comparisonOperatorList: MutableList<ComparisonOperator>

    infix fun String.nonEq(value: Any?) {
        addComparisonOperatorToQuery(NonEq(this, value))
    }

    infix fun String.eq(value: Any?) {
        addComparisonOperatorToQuery(Eq(this, value))
    }

    fun or(block: ComparisonOperator.() -> Unit) {
        addComparisonOperatorToQuery(Or().apply(block))
    }

    fun and(block: ComparisonOperator.() -> Unit) {
        addComparisonOperatorToQuery(And().apply(block))
    }

    fun addComparisonOperatorToQuery(comparisonOperator: ComparisonOperator) {
        throw RuntimeException("Not implemented yet")
    }

}