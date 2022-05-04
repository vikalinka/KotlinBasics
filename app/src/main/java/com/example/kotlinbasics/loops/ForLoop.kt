package com.example.kotlinbasics.loops

fun main() {

    val array1 = arrayOf(1, 2, 3, 4, 5)
    for (i in array1) {
        println(i)
    }

    val array2 = arrayOfNulls<Int>(101)
    for (i in 0..array2.size - 1) {
        array2[i] = i
    }
    // or
    for (i in 0 until array2.size) {
        array2[i] = i
    }
    // or
    for (i in array2.indices) {
        array2[i] = i
    }
    for (i in array2) {
        println(i)
    }

    for (i in 100 downTo 0 step 3) {
        println(i)
    }

    val arrayOfNums = arrayOfNulls<Int>(101)
    for ((index, i) in (200..300).withIndex()) {
        arrayOfNums[index] = i
    }
    for (i in arrayOfNums) {
        println(i)
    }
    for ((index, i) in arrayOfNums.withIndex()) {
        arrayOfNums[index] = i?.times(2)
    }
    for (i in arrayOfNums) {
        println(i)
    }

    val arrayOfNumbers = arrayOfNulls<Int>(301)
    for ((index, i) in (600 downTo 300).withIndex()) {
        arrayOfNumbers[index] = i
    }
    for (i in arrayOfNumbers) {
        if (i?.rem(5) == 0) {
            println(i)
        }
    }
    // or
    for (i in arrayOfNumbers.indices step 5) {
        println(arrayOfNumbers[i])
    }
}
