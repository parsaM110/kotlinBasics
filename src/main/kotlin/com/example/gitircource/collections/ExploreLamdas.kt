package com.example.gitircource.collections


/*
* Higher Order Function    -> block comment : cmd + alt + /
* */

// simple comment : cmd + /

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {

    return op(x, y)

}

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

//    val result = calculate(2, 3, { x, y -> x * y })
    val result = calculate(2, 3) { x, y -> x * y } // better approach
    println("result :$result")

    val add = calculate(2, 3, { x, y -> x + y })
    println("result :$add")

}