package ru.otus.hw_7.task_2.order

class OrderDetails(val items: List<OrderItem>) {

    var location: String = ""

    fun calcPrice(): Int {
        println("OrderDetails.calcPrice()")
        return 0
    }

    fun calcWeight(): Int {
        println("OrderDetails.calcWeight()")
        return 0
    }

    fun addItem(item: OrderItem): Int {
        println("OrderDetails.addItem()")
        return 0
    }
}