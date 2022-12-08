package ru.otus.hw_9

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.math.roundToInt

internal class BrokenCurveTest {

    @Test
    fun angleMiddle() {
        val p1 = Point()
        val p2 = Point(4.0, 0.0)
        val p3 = Point(0.0, 5.0)
        val brokenCurve = BrokenCurve(p1, p2, p3)
        assertTrue(brokenCurve.angleMiddle().times(100).roundToInt() == 90)
    }

    @Test
    fun isOnLine() {
        val p1 = Point()
        val p2 = Point(0.0, 5.0)
        val p3 = Point(4.0, 0.0)
        val brokenCurve = BrokenCurve(p1, p2, p3)
        assertTrue(brokenCurve.isOnLine(Point(0.0, 2.0)))
    }
}