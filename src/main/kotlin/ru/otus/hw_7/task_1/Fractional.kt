package ru.otus.hw_7.task_1

import kotlin.math.abs

class Fractional(private val isPositive: Boolean = true, numeratorInput: Long, denominatorInput: Long) {

    val numerator: Long
    val denominator: Long

    init {
        if (denominatorInput == 0L) {
            println("Can't divide by zero")
            throw RuntimeException()
        }
        numerator = abs(numeratorInput)
        denominator = abs(denominatorInput)
    }

    fun plus(fractional: Fractional): Fractional {
        return if (numerator == 0L) {
            fractional
        } else if (fractional.numerator == 0L) {
            this
        } else {
            val resultNumerator = sumNumerators(fractional)
            Fractional(
                resultNumerator >= 0,
                abs(resultNumerator),
                resolveDenominator(fractional)
            )
        }
    }

    fun minus(fractional: Fractional): Fractional {
        return if (numerator == 0L) {
            fractional
        } else if (fractional.numerator == 0L) {
            this
        } else {
            val resultNumerator = diffNumerators(fractional)
            Fractional(resultNumerator >= 0, abs(resultNumerator), resolveDenominator(fractional))
        }
    }

    private fun negateIfNotPositive(fractional: Fractional): Int {
        return if (fractional.isPositive) {
            1
        } else {
            -1
        }
    }

    private fun diffNumerators(fractional: Fractional): Long {
        return if (denominator != fractional.denominator) {
            (numerator * fractional.denominator) * negateIfNotPositive(this) - (fractional.numerator * denominator) * negateIfNotPositive(
                fractional
            )
        } else {
            numerator * negateIfNotPositive(this) - fractional.numerator * negateIfNotPositive(fractional)
        }
    }

    private fun sumNumerators(fractional: Fractional): Long {
        return if (denominator != fractional.denominator) {
            (numerator * fractional.denominator) * negateIfNotPositive(this) + (fractional.numerator * denominator) * negateIfNotPositive(
                fractional
            )
        } else {
            numerator * negateIfNotPositive(this) + fractional.numerator * negateIfNotPositive(fractional)
        }
    }

    private fun resolveDenominator(fractional: Fractional): Long {
        return if (denominator != fractional.denominator) {
            multiplyDenominators(fractional)
        } else {
            denominator
        }
    }

    private fun multiplyDenominators(fractional: Fractional): Long {
        return abs(fractional.denominator * denominator)
    }

    override fun toString(): String {
        return "${if (isPositive) "" else "-"}${abs(this.numerator)}/${abs(this.denominator)}"
    }

    override fun equals(other: Any?): Boolean {
        return (other is Fractional)
                && isPositive == other.isPositive
                && numerator == other.numerator
                && denominator == other.denominator
    }

    override fun hashCode(): Int {
        return isPositive.hashCode() + numerator.hashCode() + denominator.hashCode()
    }
}