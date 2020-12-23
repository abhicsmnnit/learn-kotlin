package com.example

data class Person(
    val name: String,
    val age: Int? = null // nullable integer, with default value of null
)

data class Person2(
    val name: String,
    val age: Int
)

fun main() {
    maxByNullableField()
    maxByNormalField()
}

private fun maxByNullableField() {
    val persons = listOf(
        Person("Alice"),
        Person(name = "Bob", age = 29) // named arguments
    )

    val oldest = persons.maxByOrNull {
        it.age ?: 0
    } // Elvis operator: an operator that receives two inputs and returns the first argument if it is non-null, and the second one otherwise

    println("Oldest person: $oldest")
}

private fun maxByNormalField() {
    val persons2 = listOf(
        Person2("Garry", 60),
        Person2("Harry", 25)
    )
    val oldest2 = persons2.maxByOrNull { it.age }
    println("Oldest person: $oldest2")
}
