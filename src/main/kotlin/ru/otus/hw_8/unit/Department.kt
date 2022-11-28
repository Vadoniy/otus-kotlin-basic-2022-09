package ru.otus.hw_8.unit

import ru.otus.hw_8.employee.Employee

class Department(var name: String) : Unit {
    override var personCount: Int = 0
    val employees: Set<Employee> = mutableSetOf()
}