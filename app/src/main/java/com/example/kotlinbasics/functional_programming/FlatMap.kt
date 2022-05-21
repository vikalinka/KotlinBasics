package com.example.kotlinbasics.functional_programming

fun main() {

    val revenueByWeek = listOf(
        listOf(45, 3, 6, 11, 8, 55, 24),
        listOf(14, 1, 99, 38, 6, 37, 67),
        listOf(87, 43, 8, 44, 8, 22, 91)
    )
    val total = revenueByWeek.flatMap { it }
    println(total)
    val average = total.average()
    println(average)

    val data = mapOf(
        "file1" to listOf(45, 3, 6, 11, 8, 55, 24),
        "file2" to listOf(14, 1, 99, 38, 6, 37, 67),
        "file3" to listOf(87, 43, 8, 44, 8, 22, 91)
    )
    val data_ = mapOf(
        Pair("file1", listOf(45, 3, 6, 11, 8, 55, 24)),
        Pair("file2", listOf(14, 1, 99, 38, 6, 37, 67)),
        Pair("file3", listOf(87, 43, 8, 44, 8, 22, 91)),
    )
    val list = data.flatMap { it.value }
    val avg = list.average()
    println(avg)

    val _data = mapOf(
        "January" to listOf(100, 100, 100, 100),
        "February" to listOf(200, 200, -190, 200),
        "March" to listOf(300, 180, 300, 100),
        "April" to listOf(250, -250, 100, 300),
        "May" to listOf(200, 100, 400, 300),
        "June" to listOf(200, 100, 300, 300)
    )
    printInfo(_data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data
        .map { it }
        .filter { it.value.all { it >= 0 } }

    val avgWeek = validData
        .flatMap { it.value }
        .average()
    println("Average revenue of a week = $avgWeek")

    val avgMonth = validData
        .map { it.value.sum() }
        .average()
    println("Average revenue of a month = $avgMonth")

    val maxMonth = validData
        .map { it.value.sum() }
        .maxOrNull()
    println("Max revenue was = $maxMonth")

    val monthsOfMax = data
        .map { it }
        .filter { it.value.all { it >= 0 } && it.value.sum() == maxMonth }
        .map { it.key }
    println("Max month revenue was in months: $monthsOfMax")

    val minMonth = validData
        .map { it.value.sum() }
        .minOrNull()
    println("Min month revenue was = $minMonth")

    val monthOfMin = data
        .map { it }
        .filter { it.value.all { it >= 0 } && it.value.sum() == minMonth }
        .map { it.key }
    println("Min month revenue was in months: $monthOfMin")

    val monthsWithErrors = data
        .map { it }
        .filter { it.value.any { it < 0 } }
        .map { it.key }
    println("Errors was detected in month: $monthsWithErrors")
}
