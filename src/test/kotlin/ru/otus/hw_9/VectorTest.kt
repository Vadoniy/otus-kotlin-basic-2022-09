package ru.otus.hw_9

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class VectorTest {

    @Test
    fun add() {
        val v = Vector(Point(4.0, 0.0))
        v.add(Line(Point(), Point(1.0, 0.0)))
        assertTrue(v.getSecondPoint().getX() == 5.0)
        assertTrue(v.getSecondPoint().getY() == 0.0)
    }
}