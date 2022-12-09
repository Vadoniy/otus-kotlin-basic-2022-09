package ru.otus.hw_9

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.math.roundToInt

internal class LineTest {

    @Test
    fun angle() {
        val line = Line(Point(), Point(5.0, 5.0))
        assertTrue(line.angle().roundToInt() == 45)
    }

    @Test
    fun len() {
        val line = Line(Point(7.0, 6.0), Point(3.0, 3.0))
        assertTrue(line.len() == 5.0)
    }

    @Test
    fun rotate() {
    }

    @Test
    fun rotate90() {
    }

    @Test
    fun isOnLine() {
        val line = Line(Point(), Point(5.0, 0.0))
        assertTrue(line.isOnLine(Point(2.0, 0.0)))
    }

    @Test
    fun testIsOnLine() {
        val line = Line(Point(), Point(5.0, 0.0))
        assertTrue(line.isOnLine(3.0, 0.0))
    }
}