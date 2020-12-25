package com.example

fun main() {
    // Mutable reference == Normal (non-final) reference in Java.
    var j = 47
    j = 50

    // Immutable reference == Final reference in Java.
    val i = 47
    // i = 50 -> Error. Immutable reference can't be reassigned.

    // Object being pointed to by an immutable reference can be mutable itself.
    val people = arrayListOf("Ram")
    people.add("Krishna") // Object mutated
}