package ru.otus.hw_7.task_2.payment

import ru.otus.hw_7.task_2.enums.Currency
import java.util.*

class DelayedPayment(val endDate: Date, val partAmount: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun performPartialPayment(amount: Int) {
        println("DelayedPayment.performPartialPayment($amount)")
    }

    override fun performPayment() {
        println("DelayedPayment.performPayment()")
    }
}