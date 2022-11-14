package ru.otus.hw_7.task_2.payment

import ru.otus.hw_7.task_2.enums.Currency
import ru.otus.hw_7.task_2.enums.PaymentStatus

open class Payment(val amount: Int, val currency: Currency) {

    val status: PaymentStatus = PaymentStatus.NOT_PAID

    open fun performPayment() {
        println("Payment.performPayment()")
    }
}