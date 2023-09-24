package com.example.gitircource.cast

import com.example.gitircource.classes.Course

fun checkType(type: Any) {

    when (type) {

        is Course -> {
            //val course = type as Course
            println(type.copy())
        }

        is String -> {
            println(type.lowercase())
        }

    }

}

fun castNumber(any: Any) {
    when(any) {
        any as? Double -> println("Value is Double")
        any as? Int -> println("Value is Int")
    }
}

fun main() {
    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")
    checkType(course)
    checkType("Dilip")

    castNumber(1.0)
    castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}




