package com.example.kotlinbasics.default_and_named_params

fun v(a: Int = 0, b: Int = 0, c: Int = 0) = when {
    a > 0 && b > 0 && c > 0 -> a * b * c
    a > 0 && b == 0 && c == 0 -> a * a * a
    b > 0 && a == 0 && c == 0 -> b * b * b
    c > 0 && a == 0 && b == 0 -> c * c * c
    a > 0 && b > 0 -> a * b
    a > 0 && c > 0 -> a * c
    b > 0 && c > 0 -> b * c
    else -> error("...")
}

fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c

fun main() {

    val v = v(b = 3, a = 2)
    println(v)

    val vol = volume(a = 5, b = 6)
    println(vol)
}
