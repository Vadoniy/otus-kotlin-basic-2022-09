package ru.otus.hw_9

class Vector(private var p2: Point) : Line(Point(), p2) {

    constructor(x: Double, y: Double) : this(Point(x, y))
    constructor(line: Line) : this(Point(line.getSecondPoint().getX(), line.getSecondPoint().getY()))

    fun add(x: Double, y: Double): Line {
        val pX = p2.getX() + x
        val pY = p2.getY() + y
        return this.set(pX, pY)
    }

    fun add(v: Line): Line {
        super.getFirstPoint().setX(v.getFirstPoint().getX())
        super.getFirstPoint().setY(v.getFirstPoint().getY())
        p2.setX(p2.getX() + v.getSecondPoint().getX())
        p2.setY(p2.getY() + v.getSecondPoint().getY())
        return this
    }

    fun set(x: Double, y: Double): Line {
        p2.setX(x)
        p2.setY(y)
        return this
    }

    fun set(v: Line): Line {
        super.getFirstPoint().setX(v.getFirstPoint().getX())
        super.getFirstPoint().setY(v.getFirstPoint().getY())
        p2.setX(v.getSecondPoint().getX())
        p2.setY(v.getSecondPoint().getY())
        return this
    }

    fun setZero(): Line {
        set(0.0, 0.0)
        return this
    }
}
