package ru.otus.hw_7.task_1

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

internal class FractionalTest {

    @Test
    fun notZeroDenominator() {
        assertThrows<Exception> {
            Fractional(true, kotlin.random.Random.nextLong(), 0)
        }
    }

    @Test
    fun plusPositives() {
        val f1 = Fractional(true, 1, 2)
        val f2 = Fractional(true, 3, 5)
        assertEquals(Fractional(true, 11, 10), f1.plus(f2))
        val f3 = Fractional(true, 3, 8)
        val f4 = Fractional(true, 1, 8)
        assertEquals(Fractional(true, 4, 8), f3.plus(f4))
        val f5 = Fractional(true, 1, 7)
        val f6 = Fractional(true, 1, 8)
        assertEquals(Fractional(true, 15, 56), f5.plus(f6))
    }

    @Test
    fun plusWithZero() {
        val f1 = Fractional(true, 0, 5)
        val f2 = Fractional(true, 3, 4)
        assertEquals(f1.plus(f2), Fractional(true, 3, 4))
    }

    @Test
    fun plusNegatives() {
        val f1 = Fractional(false, 1, 2)
        val f2 = Fractional(false, 2, 3)
        assertEquals(Fractional(false, 7, 6), f1.plus(f2))
        val f3 = Fractional(false, 1, 2)
        val f4 = Fractional(false, 2, 3)
        assertEquals(Fractional(false, 7, 6), f3.plus(f4))
        val f5 = Fractional(false, 1, 2)
        val f6 = Fractional(false, 2, 3)
        assertEquals(Fractional(false, 7, 6), f5.plus(f6))
        val f7 = Fractional(false, 1, 2)
        val f8 = Fractional(false, 2, 3)
        assertEquals(Fractional(false, 7, 6), f7.plus(f8))
        val f9 = Fractional(false, 0, 7)
        val f10 = Fractional(false, 1, 5)
        assertEquals(Fractional(false, 1, 5), f9.plus(f10))
        val f11 = Fractional(true, 7, 10)
        val f12 = Fractional(false, 1, 10)
        assertEquals(Fractional(true, 6, 10), f11.plus(f12))
        val f13 = Fractional(false, 1, 10)
        val f14 = Fractional(true, 0, 10)
        assertEquals(Fractional(false, 1, 10), f13.plus(f14))
    }

    @Test
    fun minusNegatives() {
        val f1 = Fractional(false, 1, 2)
        val f2 = Fractional(false, 2, 3)
        assertEquals(Fractional(true, 1, 6), f1.minus(f2))
        val f3 = Fractional(false, 1, 2)
        val f4 = Fractional(true, 2, 3)
        assertEquals(Fractional(false, 7, 6), f3.minus(f4))
        val f5 = Fractional(true, 1, 2)
        val f6 = Fractional(false, 2, 3)
        assertEquals(Fractional(true, 7, 6), f5.minus(f6))
        val f7 = Fractional(false, 1, 7)
        val f8 = Fractional(false, 0, 5)
        assertEquals(Fractional(false, 1, 7), f7.minus(f8))
        val f9 = Fractional(false, 0, 7)
        val f10 = Fractional(false, 1, 5)
        assertEquals(Fractional(false, 1, 5), f9.minus(f10))
    }
}