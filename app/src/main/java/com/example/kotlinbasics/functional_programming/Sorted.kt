package com.example.kotlinbasics.functional_programming

fun main() {
    val numbers = (0..100).toList()
    val sortedNumbers = numbers.sortedByDescending { it }
    for (i in sortedNumbers) {
        println(i)
    }

    val array = arrayOf(4, -5, 1, 0, 67, 4)
    val sortedArray = array.sortedArrayDescending()
    for (i in sortedArray) {
        println(i)
    }

    val nums = mutableListOf<Int>()
    for (i in 0..10) {
        val random = (0..10).random()
        nums.add(random)
    }
    nums
        .filter { it % 5 == 0 || it % 3 == 0 }
        .map { it * it }
        .sortedByDescending { it }
        .map { "num = $it" }
        .forEach { println(it) }
}
