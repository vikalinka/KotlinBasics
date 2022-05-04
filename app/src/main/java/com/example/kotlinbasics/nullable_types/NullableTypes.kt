package com.example.kotlinbasics.nullable_types

private const val s1  = "abc"
private const val s2  = ""
private var s3: String? = null

private val result = s1.length + s2.length + (s3?.length ?: 0)

fun main() {
    print(result)
}
