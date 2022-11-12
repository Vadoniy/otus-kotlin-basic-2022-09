package ru.otus.hw_7.task_2

import ru.otus.hw_7.task_2.order.OrderItem

class Customer(var name: String, var address: String?) {

    constructor(name: String) : this(name, null)

    val orders = mutableListOf<OrderItem>()

    fun calcPrice(): Int {
        println("Customer.calcPrice()")
        return 0
    }

    fun calcWeight(): Int {
        println("Customer.calcWeight()")
        return 0
    }

    fun addItem(item: OrderItem) {
        orders.add(item)
        println("Customer.addItem()")
    }
}