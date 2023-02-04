package ru.otus.hw_11.where

import ru.otus.utils.wrapWithBrackets

open class ComparisonOperatorFacade(
    override val comparisonOperatorList: MutableList<ComparisonOperator> = mutableListOf(),
    open val currentComparisonOperator: String = ""
) : ComparisonOperator {

    override fun addComparisonOperatorToQuery(comparisonOperator: ComparisonOperator) {
        comparisonOperatorList.add(comparisonOperator)
    }

    override fun toString(): String {
        return when (comparisonOperatorList.size) {
            0 -> ""
            1 -> comparisonOperatorList[0].toString()
            else -> comparisonOperatorList.joinToString(" $currentComparisonOperator ").wrapWithBrackets()
        }
    }
}