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
    // println(mix(RED, BLUE)) -> Exception in thread "main" java.lang.Exception: Dirty color

    println(mixOptimized(RED, YELLOW))
    println(mixOptimized(YELLOW, RED))
    // println(mixOptimized(RED, BLUE)) -> Exception in thread "main" java.lang.Exception: Dirty color
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
    when (setOf(c1, c2)) { // Argument of `when` can be any object
        setOf(RED, YELLOW) -> ORANGE // Argument is checked for equality with the branch conditions
        setOf(BLUE, YELLOW) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun mixOptimized(c1: Color, c2: Color) = // Optimized because it creates no instances of `Set`
    when { // No arguments for `when`
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == BLUE && c2 == YELLOW) || (c1 == YELLOW && c2 == BLUE) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }