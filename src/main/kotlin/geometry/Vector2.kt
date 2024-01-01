package org.example.geometry

import kotlin.math.pow
import kotlin.math.sqrt

class Vector2(private val x: Double, private val y: Double) {

    val magnitude: Double
        get() = sqrt(x.pow(2) + y.pow(2))

    operator fun plus(other: Vector2) = Vector2(x + other.x, y + other.y)
    operator fun unaryPlus() = this
    operator fun minus(other: Vector2) = Vector2(x - other.x, y - other.y)
    operator fun unaryMinus() = Vector2(-x, -y)

}