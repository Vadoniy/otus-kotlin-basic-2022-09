package ru.otus.hw_9

import kotlin.math.*

open class Line(private var a: Point, private var b: Point) {

    constructor(aX: Double, aY: Double, bX: Double, bY: Double) : this(Point(aX, aY), Point(bX, bY))
    constructor(line: Line) : this(line.a, line.b)

    fun angle(): Double {
        return Math.toDegrees(
            atan((b.getY() - a.getY()) / (b.getX() - a.getX()))
        )
    }

    fun len(): Double {
        return sqrt((a.getX() - b.getX()).pow(2.0) + (a.getY() - b.getY()).pow(2))
    }

    fun rotate(degrees: Double): Line {
        val x2 = (b.getX() * cos(degrees) - b.getY() * sin(degrees))
        val y2 = (b.getY() * cos(degrees) + b.getX() * sin(degrees))
        return Line(a.getX(), a.getY(), x2, y2)
    }

    fun rotate90(dir: Int): Line {
        val degrees = when {
            dir < 0 -> 90.0
            else -> -90.0
        }
        val x2 = (b.getX() * cos(degrees) - b.getY() * sin(degrees))
        val y2 = (b.getY() * cos(degrees) + b.getX() * sin(degrees))
        return Line(a.getX(), a.getY(), x2, y2)
    }

    open fun isOnLine(p: Point): Boolean {
        val pX = p.getX()
        val pY = p.getY()
        return isOnLine(pX, pY)
    }

    open fun isOnLine(pX: Double, pY: Double): Boolean {
        return (pX - a.getX()) * (b.getY() - a.getY()) - (b.getX() - a.getX()) * (pY - a.getY()) == 0.0
    }

    override fun toString(): String {
        return "Line(a=$a, b=$b)"
    }

    fun getFirstPoint(): Point {
        return a
    }

    fun getSecondPoint(): Point {
        return b
    }
}