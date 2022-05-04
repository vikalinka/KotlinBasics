package com.example.kotlinbasics.collections

fun main() {

    val arrayList1: ArrayList<Int> = ArrayList<Int>()
    arrayList1.add(3)
    println(arrayList1[0])

    // by clean architecture should use abstraction instead of implementation (List instead of ArrayList)
    // all List, Set and Map collections are immutable, i.e. you can't use method .add()
    val arrayList2: List<Int> = ArrayList<Int>()

    // to add new element to List should use MutableList interface
    val arrayList3: MutableList<Int> = ArrayList<Int>()
    arrayList3.add(9)
    println(arrayList3[0])

    // to initialize collection you can use methods listOf, mutableListOf
    val arrayList4 = mutableListOf<Int>()
    arrayList4.add(741)
    println(arrayList4[0])

}
