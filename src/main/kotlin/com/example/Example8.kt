package com.example

import com.example.Color.*

enum class Color {
    BLUE, RED, GREEN, VIOLET, INDIGO, YELLOW, ORANGE
}

fun main() {
    println(getMnemonic(GREEN))
    println(getWarmth(INDIGO))
}

fun getMnemonic(c: Color) = // `when` is an expression - can be returned directly from a function
    when (c) { // `when` replaces Java's `switch`
        RED -> "Richard" // No breaks required like Java
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun getWarmth(c: Color) =
    when (c) {
        RED, ORANGE, YELLOW -> "warm" // Can club together multiple `when` branches
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }