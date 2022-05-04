package com.example.kotlinbasics.operators

var n: Int = 4000
private var food: String? = null

fun main() {

    if (n <= 200) {
        food = "f3"
    } else if (n > 200 && n <= 500) {
        food = "f2"
    } else {
        food = "f1"
    }
    println("Food = $food")

    // or
    food = when {
        n <= 200 -> "f3"
        n in 201..500 -> "f2"
        else -> "f1"
    }
    println("Food = $food")

    // or
    food = when {
        n > 500 -> {
            n -= 500
            "f1"
        }
        n > 200 -> {
            n -= 200
            "f2"
        }
        else -> {
            n -= 30
            "f3"
        }
    }
    println("Food = $food, n left = $n")
}
