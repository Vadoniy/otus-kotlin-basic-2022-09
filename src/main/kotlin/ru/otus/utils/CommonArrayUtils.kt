package ru.otus.utils

fun <T> listPlusList(list1: List<T>, list2: List<T>): String {
    val result = listOf(list1, list2)
    return result.flatten().joinToString("")
}

fun <T> listMinusList(list1: List<T>, list2: List<T>): String {
    return (list1 - list2).joinToString("")
}

fun <T> listCrossList(list1: List<T>, list2: List<T>): String {
    return list1.intersect(list2).joinToString("")
}

fun <T> listCrossListViaFilter(list1: List<T>, list2: List<T>): String {
    return list1.asSequence().filter { it -> list2.contains(it) }.toSet()
        .joinToString("")
}