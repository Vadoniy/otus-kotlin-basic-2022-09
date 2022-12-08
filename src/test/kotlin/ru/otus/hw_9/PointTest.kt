package ru.otus.hw_9

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class PointTest {

    @Test
    fun distanceSq() {
        val point = Point(2.0, 0.0)
        val zeroPoint = Point()
        assertTrue(zeroPoint.distanceSq(point) == 4.0)
    }

    @Test
    fun distance() {
        val point = Point(2.0, 0.0)
        val zeroPoint = Point()
        assertTrue(zeroPoint.distance(point) == 2.0)
    }

    @Test
    fun setLocation() {
        val point = Point(2.0, 2.0)
        assertTrue(point.getY() == 2.0)
        assertTrue(point.getX() == 2.0)
        point.setLocation(4.0, 4.0)
        assertTrue(point.getY() == 4.0)
        assertTrue(point.getX() == 4.0)
    }
}