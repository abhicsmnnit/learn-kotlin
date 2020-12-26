package com.example

// In Kotlin, `enum` is a soft keyword: it has a special meaning when it comes before `class`, but it can be used as a regular name in other places.
// On the other hand, `class` is still a keyword, and you can't name a variable as class - you'll have to say something like clazz or aClass.
enum class Color1 {
    RED, BLUE, GREEN
}

enum class Color2(private val r: Int, private val g: Int, private val b: Int) { // Declares properties of enum constants
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);
    // Semicolon here is required! Only place in Kotlin where a semicolon is required:
    // if you define any methods in the enum class, the semicolon separates the enum constants list and the method definitions.

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(Color1.BLUE)
    println(Color2.BLUE)
    println(Color2.BLUE.rgb())
}