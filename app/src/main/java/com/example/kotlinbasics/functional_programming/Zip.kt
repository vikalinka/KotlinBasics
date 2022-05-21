package com.example.kotlinbasics.functional_programming

fun main() {

    val numbers = generateList("+370 600 00")
    val names = generateList("Name")
    val contacts = numbers.zip(names)
    contacts.forEach { contact ->
        println("${contact.second} ${contact.first}")
    }

    val firstnames = generateList("Firstname")
    val lastnames = generateList("Lastname")
    val pairs = lastnames.zip(firstnames)
    pairs.forEach { println(it) }
}

fun generateList(string: String) = generateSequence(0) { it + 1 }.take(1000).map {
    when {
        it < 10 -> {
            "${string}00$it"
        }
        it < 100 -> {
            "${string}0$it"
        }
        else -> {
            "${string}$it"
        }
    }
}.toList()
