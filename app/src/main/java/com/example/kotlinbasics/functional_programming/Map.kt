package com.example.kotlinbasics.functional_programming

fun main() {
    val numbers = (0..99).toList()
    val numbersString = numbers.map { "Number = ${it * 2}" }
    for (i in numbersString) {
        println(i)
    }
}
