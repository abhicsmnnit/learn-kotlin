package com.example

fun main() {
    printFizzBuzzTill100()
}

fun printFizzBuzzTill100() {
    for (i in 1..100) { // Iterate over the integer range 1 to 100. Ranges in Kotlin are closed or inclusive, so the 2nd value is always a part of the range.
        when {
            i % 3 == 0 && i % 5 == 0 -> print("FizzBuzz ")
            i % 5 == 0 -> print("Buzz ")
            i % 3 == 0 -> print("Fizz ")
            else -> print("$i ")
        }
    }
}