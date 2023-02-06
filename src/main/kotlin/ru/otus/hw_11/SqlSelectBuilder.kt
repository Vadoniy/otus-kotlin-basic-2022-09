package ru.otus.hw_11

import ru.otus.hw_11.where.ComparisonOperator
import ru.otus.hw_11.where.ComparisonOperatorFacade

class SqlSelectBuilder(private val columnList: MutableList<String> = mutableListOf()) {

    private lateinit var table: String
    private var whereCondition: ComparisonOperator? = null

    fun select(vararg fromColumns: String) = this.columnList.addAll(fromColumns)

    fun from(fromTable: String) {
        this.table = fromTable
    }

    fun where(block: ComparisonOperator.() -> Unit) {
        whereCondition = ComparisonOperatorFacade().apply(block)
    }

    fun build(): String {
        val columns = getColumnList()
        val whereString = when (getWhereStatement()) {
            "" -> ""
            else -> " where $whereCondition"
        }

        return "select $columns from $table$whereString"
    }

    private fun getColumnList(): String {
        return when {
            columnList.isNotEmpty() -> columnList.joinToString(", ")
            else -> "*"
        }
    }

    private fun getWhereStatement(): String {
        return when {
            whereCondition != null -> whereCondition.toString()
            else -> ""
        }
    }
}