package com.example

// This function is a block-body function (because of the curly braces around the function body).
fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b // `if` is an expression in Kotlin. In Java, it's a statement.
}

// This is an expression-body function (because it returns an expression).
// Return type can also be omitted here. For an expression-body function, compiler can deduce the return type. (Type inference!)
fun max2(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max1(10, 20))
    println(max2(10, 20))
}
