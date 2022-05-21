package com.example.kotlinbasics.functional_programming

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee Nr.$it" }

    // take
    val first30employees = employees.take(30)
    first30employees.forEach { println(it) }
    // takeLast
    val last30employees = employees.takeLast(30)
    last30employees.forEach { println(it) }
    // drop
    val employeesAfterDrop = employees.drop(30)
    employeesAfterDrop.forEach { println(it) }
    // dropLast
    val employeesAfterDropLast = employees.dropLast(30)
    employeesAfterDropLast.forEach { println(it) }
    // sequence is lazy
    val sequence = generateSequence(0) { it + 2 }
    val first10EvenNumbers = sequence.take(10)
    first10EvenNumbers.forEach { println(it) }

    val charSequence = generateSequence('A') { it + 1 }
    val first10chars = charSequence.take(10)
    first10chars.forEach { println(it) }

    val randomNumbersSequence = generateSequence {
        (0..100).random()
    }
    val first10numbers = randomNumbersSequence.take(10)
    first10numbers.forEach { println(it) }

    val employeeSequence = generateSequence(1) { it + 1 }
    val first100employees = employeeSequence.take(100).map { "Employee nr. $it" }
    first100employees.forEach { println(it) }

    generateSequence(1) { it + 1 }.take(100).map { "Employee nr. $it" }.forEach { println(it) }
}
