package org.example.geometry

import kotlin.math.pow
import kotlin.math.sqrt

class Vector2(var x: Double, var y: Double) {

    // maybe would be better as non-member function?
    val euclideanNorm: Double
        get() = sqrt(x.pow(2) + y.pow(2))

    val unitVector: Vector2
        get() = Vector2(x / euclideanNorm, y / euclideanNorm)

    operator fun plus(other: Vector2) = Vector2(x + other.x, y + other.y)
    operator fun plusAssign(other: Vector2) {
        x += other.x
        y += other.y
    }

    operator fun unaryPlus() = this
    operator fun minus(other: Vector2) = Vector2(x - other.x, y - other.y)
    operator fun minusAssign(other: Vector2) {
        x -= other.x
        y -= other.y
    }

    operator fun unaryMinus() = Vector2(-x, -y)

    operator fun times(scalar: Double) = Vector2(x * scalar, y * scalar)
    operator fun timesAssign(scalar: Double) {
        x *= scalar
        y *= scalar
    }

    operator fun div(scalar: Double) = Vector2(x / scalar, y / scalar)
    operator fun divAssign(scalar: Double) {
        x /= scalar
        y /= scalar
    }

    fun dot(vec: Vector2) = x * vec.x + y * vec.y


    // equals should be change due to floating-point errors
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vector2

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x.hashCode()
        result = 31 * result + y.hashCode()
        return result
    }

    override fun toString(): String {
        return "($x, $y)"
    }


}

