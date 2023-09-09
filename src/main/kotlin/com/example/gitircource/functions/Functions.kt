package com.example.gitircource.functions

fun printName(name: String): Unit { // if you say noting it will be Unit basically it is null

    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionApprouch1(x: Int, y: Int): Int = x+y

fun main(){
    val unit = printName("Dilip")
    printName("unit is $unit")

    val result = addition(1,2)
    println("result is $result")

    val result1 = additionApprouch1(1,2)
    println("result is $result1")
}




