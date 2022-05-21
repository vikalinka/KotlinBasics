package com.example.kotlinbasics.functional_programming

fun main() {
    val numbers = mutableListOf<Int>()
    for (i in 0..99) {
        numbers.add(i)
    }
    val evenNumbers = numbers.filter { it % 2 == 0 }
    for (i in evenNumbers) {
        println(i)
    }

    val names = listOf("Aaa", "Bbb", "Abc", "Bcd", "Art", "Www", "aAA")
    // 1
    val predicate: (String) -> Boolean = { string -> string.startsWith("A") }
    val filteredNames1 = names.filter(predicate)
    println(filteredNames1)
    // 2
    val filteredNames2 = names.filter { it.startsWith("A") }
    println(filteredNames2)
}
