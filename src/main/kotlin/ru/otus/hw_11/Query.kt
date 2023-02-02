package ru.otus.hw_11

fun query(init: SqlSelectBuilder.() -> Unit) = SqlSelectBuilder().apply(init)