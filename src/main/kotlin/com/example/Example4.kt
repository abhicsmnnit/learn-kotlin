package com.example

fun main(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name") // String templates: use $variableName inside a String for concatenation.
    // The compiled code generates a StringBuilder and appends the constant parts and variable values to it.

    // Even complex expressions can be put inside string templates.
    println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin"}")
    // Double quotes can also be nested within double quotes, as long as they're within an expression.
}