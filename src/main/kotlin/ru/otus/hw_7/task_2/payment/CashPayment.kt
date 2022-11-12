package ru.otus.hw_7.task_2.payment

import ru.otus.hw_7.task_2.enums.Currency

class CashPayment(val total: Int, val change: Int, amount: Int, currency: Currency) : Payment(amount, currency) {

    override fun performPayment() {
        println("CashPayment.performPayment()")
    }
}