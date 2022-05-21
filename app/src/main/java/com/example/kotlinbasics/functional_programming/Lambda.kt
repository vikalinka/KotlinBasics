package com.example.kotlinbasics.functional_programming

fun main() {
    val square: (Int) -> Int = { a -> a * a }
    println(square(3))

    val perimeter: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(perimeter(4, 5))

    val name: (String) -> Unit = { println(it) }
    name("Vi")

    val sortedArray: (Array<Int>) -> Array<Int> = {
        for (i in it.indices) {
            for (j in 1 until it.size) {
                if (it[j] > it[j - 1]) {
                    val temp = it[j]
                    it[j] = it[j - 1]
                    it[j - 1] = temp
                }
            }
        }
        it
    }

    sortedArray(arrayOf(3, 44, 9, 5, 5, 7, -2, 0)).forEach { num ->
        println(num)
    }
}
