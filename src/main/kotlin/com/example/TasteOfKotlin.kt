package com.example

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("Alice"),
        Person(name = "Bob", age = 29)
    )

    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("Oldest person: $oldest")
}
