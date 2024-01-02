package org.example

import org.example.geometry.Vector2


fun main() {
    val vec1 = Vector2(2.0, 3.0)
    val vec2 = Vector2(1.0, 1.5)
    println(vec1 + vec2)
    println(vec1 * 2.0)


    println((vec1 + vec2).euclideanNorm)
    println(vec1.dot(vec2))
    val t = vec1.normalized
    println(t)
    println(t.euclideanNorm)

}