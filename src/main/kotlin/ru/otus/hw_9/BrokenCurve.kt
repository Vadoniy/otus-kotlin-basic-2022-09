package ru.otus.hw_9

import kotlin.math.acos
import kotlin.math.pow
import kotlin.math.sqrt

class BrokenCurve(var p1: Point, var p2: Point, var p3: Point) : Line(p1, p2) {

    fun angleMiddle(): Float {
        val x1 = p1.getX() - p2.getX()
        val x2 = p3.getX() - p2.getX()
        val y1 = p1.getY() - p2.getY()
        val y2 = p3.getY() - p2.getY()
        val d1 = sqrt(x1.pow(2) + y1.pow(2))
        val d2 = sqrt(x2.pow(2) + y2.pow(2))
        return acos((x1 * x2 + y1 * y2) / (d1 * d2)).toFloat()
    }

    override fun isOnLine(pX: Double, pY: Double): Boolean {
        val l1 = Line(p1, p2)
        val l2 = Line(p2, p3)
        return l1.isOnLine(pX, pY) || l2.isOnLine(pX, pY)
    }
}