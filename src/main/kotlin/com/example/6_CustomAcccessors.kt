package com.example

// No accessors are generated for private fields
class Rectangle(private val height: Int, private val width: Int) {
    // A custom accessor
    val isSquare: Boolean
        get() { // Property get declaration
            return height == width
        }
}

fun main() {
    val r1 = Rectangle(3, 4)
    printSquareStatus(r1)
    // println(r1.height) -> Error: Can not access 'height': It's private in Rectangle

    val r2 = Rectangle(5, 5)
    printSquareStatus(r2)
}

private fun printSquareStatus(rectangle: Rectangle) {
    println("It's ${if (rectangle.isSquare) "" else "not "}a square")
}