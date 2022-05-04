package com.example.kotlinbasics.operators

private const val temp = 1

private const val time = 13
private const val isGood = false

fun main() {

    val cond = when {
        temp <= 0 -> "ice"
        temp in 1..99 -> "liquid"
        else -> "gas"
    }
    println("Water condition is = $cond")

    val action = when {
        time in 6..22 && isGood -> "walk"
        time in 6..22 && !isGood -> "read"
        else -> "sleep"
    }
    println("TODO = $action")
}
