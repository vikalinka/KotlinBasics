package com.example.kotlinbasics.functional_programming

var nums: MutableList<Int>? = mutableListOf()

fun main() {

    val randomNumberSequence = generateSequence {
        (0..100).random()
    }
    val numbers = randomNumberSequence.take(1000).toList()

    with(numbers) {
        val sum = sum()
        println("Sum = $sum")

        val avg = average()
        println("Average = $avg")

        val max = maxOrNull()
        println("Max number = $max")

        val min = minOrNull()
        println("Min number = $min")

        val first = first()
        println("First number = $first")

        val last = last()
        println("Last number = $last")
    }

    nums?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((0..1000).random())
            }
            filter { it % 2 == 0 }.take(15).forEach { println(it) }
        }
    }
}
