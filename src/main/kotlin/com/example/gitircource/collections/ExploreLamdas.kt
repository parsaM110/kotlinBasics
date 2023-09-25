package com.example.gitircource.collections

fun main() {
    val addLambda = { x: Int -> x + x }

    val addResult = addLambda(3)
    println("addResult $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("x is $x and y is $y")
        x * y
    }

    val multiplyResult = multiplyLambda(2, 4)
    println("multiplyResult $multiplyResult")

}