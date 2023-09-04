package com.example.gitircource.basics

fun main(){

    val name = "Dilip"
    println(name)

    var age = 34
    println(age)
    age = 35
    println(age)


    val salary = 3000L
    println(salary)

    val course = "Kotlin Spring"
    println("course: $course and the course length is ${course.length}") // string interpolation | string template

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """ 
        ABC
        DEF
    """.trimIndent()

    print(multiLine1)



}