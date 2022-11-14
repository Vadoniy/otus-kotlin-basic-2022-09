package ru.otus.hw_7.task_2.order

import ru.otus.hw_7.task_2.Customer
import ru.otus.hw_7.task_2.enums.OrderStatus
import ru.otus.hw_7.task_2.payment.Payment
import java.sql.Date
import java.time.LocalDate

class Order(val customer: Customer, val details: OrderDetails, var payment: Payment?) {

    val date: Date = Date.valueOf(LocalDate.now())
    var status: OrderStatus = OrderStatus.WAITING_FOR_PAYMENT

    fun calcPrice(): Int {
        println("Order.calcPrice()")
        return 0
    }

    fun calcWeight(): Int {
        println("Order.calcWeight()")
        return 0
    }

    fun pay(payment: Payment) {
        println("Order.pay()")
    }
}