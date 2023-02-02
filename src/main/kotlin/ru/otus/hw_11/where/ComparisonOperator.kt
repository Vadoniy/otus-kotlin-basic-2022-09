package ru.otus.hw_11.where

abstract class ComparisonOperator {

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

    protected abstract fun addComparisonOperatorToQuery(comparisonOperator: ComparisonOperator)

//    infix fun String.nonEq(value: Any?) {
//        addOperand(WhereNonEq(this, value))
//    }

//    fun and(block: WhereCondition.() -> Unit) {
//        addOperand(WhereOperatorAnd().apply(block))
//    }
//
//    fun or(block: WhereCondition.() -> Unit) {
//        addOperand(WhereOperatorOr().apply(block))
//    }

//    infix fun String.eq(value: Any?) {
//        addOperand(WhereEq(this, value))
//    }
//

}