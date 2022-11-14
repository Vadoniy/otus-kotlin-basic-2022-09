package ru.otus.hw_7.task_2.payment

import ru.otus.hw_7.task_2.enums.Currency
import ru.otus.hw_7.task_2.enums.PaymentStatus

class OnlinePayment(val bankId: String, val bankName: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun checkIfSucceed(): PaymentStatus {
        println("OnlinePayment.checkIfSucceed()")
        return PaymentStatus.PROCESSING
    }

    override fun performPayment() {
        println("OnlinePayment.performPayment()")
    }
}