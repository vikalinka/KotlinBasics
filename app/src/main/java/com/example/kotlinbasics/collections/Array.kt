package com.example.kotlinbasics.collections

fun main() {

    // array has fixed size, i.e. size = 6
    val array = arrayOf(1, 5, 6, 99, 343, 44)
    println(array[3])

    array[0] = 77
    println(array[0])

    // nullable arrays
    val nullableArray1 = arrayOf(3, 8, null)

    val nullableArray2: Array<Int?> = arrayOf(4, 12, 5)
    nullableArray2[0] = null
    println(nullableArray2[0])

    val nullableArray3 = arrayOfNulls<Int>(4)
    nullableArray3.forEach { println(it) }
}
