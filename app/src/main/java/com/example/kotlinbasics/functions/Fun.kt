package com.example.kotlinbasics.functions

import kotlin.math.min

fun substringText1(text: String) = text.substring(0, (if (text.length < 5) text.length else 5))
fun substringText2(text: String) = text.substring(0, min(5, text.length))

fun sum1(vararg numbers: Int) = numbers.sum()
fun sum2(vararg numbers: Int): Int {
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

fun sortAscending(list: MutableList<Int>): List<Int> {
    for (i in 0 until list.size) {
        for (j in 1 until list.size) {
            if (list[j] < list[j - 1]) {
                val temp = list[j]
                list[j] = list[j - 1]
                list[j - 1] = temp
            }
        }
    }
    return list
}
// overloaded sorting method for arrays
fun sortAscending(array: Array<Int>): List<Int> {
    for (i in array.indices) {
        for (j in 1 until array.size) {
            if (array[j] < array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
        }
    }
    return array.toList()
}
// overloaded sorting method for varargs
fun sortAscending(vararg numbers: Int): List<Int> {
    for (i in numbers.indices) {
        for (j in 1 until numbers.size) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers.toList()
}

fun sortDescending(list: MutableList<Int>): List<Int> {
    for (i in 0 until list.size) {
        for (j in 1 until list.size) {
            if (list[j] > list[j - 1]) {
                val temp = list[j]
                list[j] = list[j - 1]
                list[j - 1] = temp
            }
        }
    }
    return list
}
// overloaded sorting method for arrays
fun sortDescending(array: Array<Int>): List<Int> {
    for (i in array.indices) {
        for (j in 1 until array.size) {
            if (array[j] > array[j - 1]) {
                val temp = array[j]
                array[j] = array[j - 1]
                array[j - 1] = temp
            }
        }
    }
    return array.toList()
}
// overloaded sorting method for varargs
fun sortDescending(vararg numbers: Int): List<Int> {
    for (i in numbers.indices) {
        for (j in 1 until numbers.size) {
            if (numbers[j] > numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers.toList()
}

fun main() {

    val newText1 = substringText1("Bye Java!")
    val newText2 = substringText2("Hello Kotlin!")
    println(newText1)
    println(newText2)

    val sum1 = sum1(1, 2, 4)
    val sum2 = sum2(1, 2, 10)
    println(sum1)
    println(sum2)

    val newList1 = sortAscending(mutableListOf(2, 6, 5, 3, 4, 4))
    val newList2 = sortAscending(arrayOf(2, 6, 5, 3, 4, 4))
    val newList3 = sortAscending(2, 6, 5, 3, 4, 4)

    val newList4 = sortDescending(mutableListOf(2, 6, 5, 3, 4, 4))
    val newList5 = sortDescending(arrayOf(2, 6, 5, 3, 4, 4))
    val newList6 = sortDescending(2, 6, 5, 3, 4, 4)

    println(newList1)
    println(newList2)
    println(newList3)
    println(newList4)
    println(newList5)
    println(newList6)
}
