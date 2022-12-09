package ru.otus.hw_9

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

class Point(private var x: Double, private var y: Double) {

    constructor() : this(x = 0.0, y = 0.0)

    fun setX(value: Double) {
        x = value
    }

    fun setY(value: Double) {
        y = value
    }

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun distanceSq(p: Point): Double {
        return distanceSq(this, p)
    }

    fun distance(p: Point): Double {
        return sqrt(distanceSq(this, p))
    }

    fun setLocation(x: Double, y: Double) {
        this.x = x
        this.y = y
    }


    override fun toString(): String {
        return "Point[$x, $y]"
    }

    companion object {
        fun compareX(a: Point, b: Point): Int {
            return when {
                a.x > b.x -> 1
                a.x < b.x -> -1
                else -> 0
            }
        }

        fun compareY(a: Point, b: Point): Int {
            return when {
                a.x > b.x -> 1
                a.x < b.x -> -1
                else -> 0
            }
        }

        fun distanceSq(a: Point, b: Point): Double {
            return (b.x - a.x).pow(2.0) + (b.y - a.y).pow(2.0)
        }

        fun distance(a: Point, b: Point): Double {
            return abs(distanceSq(a, b))
        }
    }
}