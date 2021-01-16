package com.example

// No `public` required: `public` is the default visibility in Kotlin
class Person3(
    // In Java, the combination of the field and its accessors is often referred to as a property.
    // In Kotlin, properties are a first-class citizens, which entirely replaces fields and accessor methods.

    val name: String, // val => Read-only property: generates a field and a getter
    var isMarried: Boolean // var => Writable property: generates a field, a getter, and a setter
)

fun main() {
    val alice = Person3("Alice", true)
    printMaritalStatus(alice)

    alice.isMarried = false // Var can be updated using the auto-generated "setter"
    // alice.name = "Bob" -> Error: Val can't be reassigned

    printMaritalStatus(alice)
}

private fun printMaritalStatus(alice: Person3) {
    println("${alice.name} is ${if (alice.isMarried) "" else "not "}married")
}