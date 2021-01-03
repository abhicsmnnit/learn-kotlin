package com.example

import com.example.Color.*

enum class Color {
    BLUE, RED, GREEN, VIOLET, INDIGO, YELLOW, ORANGE
}

fun main() {
    println(getMnemonic(GREEN))
    println(getWarmth(INDIGO))
    println(mix(RED, YELLOW))
    println(mix(YELLOW, RED))
    println(mix(RED, BLUE))
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

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(BLUE, YELLOW) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }