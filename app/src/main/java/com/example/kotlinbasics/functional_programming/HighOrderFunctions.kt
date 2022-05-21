package com.example.kotlinbasics.functional_programming

import java.util.*

fun main() {
    val result = modifyString("Hello Kotlin!") { it.uppercase(Locale.getDefault()) }
    println(result)

    sum(listOf(1, 2, 3)) {
        println("Sum = ${it.sum()}")
    }
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

inline fun sum(numbers: List<Int>, sum: (List<Int>) -> Unit) = sum(numbers)
