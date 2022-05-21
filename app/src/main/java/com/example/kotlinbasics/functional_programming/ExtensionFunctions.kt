package com.example.kotlinbasics.functional_programming

fun main() {
    val num = 467

    if (num.isValid()) {
        println("valid")
    }

    if (num.isPositive()) {
        println("positive")
    }

    println("$num is prime number = ${num.isPrime()}")

    myWith(num) {
        println("$this is positive number = ${isPositive()}")
    }
}

fun Int.isValid() = this in 5..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 1) {
        return false
    }
    for (i in 2 until this) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

inline fun <T, R> myWith(obj: T, operation: (T.() -> R)): R {
    return obj.operation()
}
