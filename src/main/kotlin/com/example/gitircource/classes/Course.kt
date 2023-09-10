package com.example.gitircource.classes

data class Course(val id: Int, val name: String, val author: String)


fun main() {
    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")

    val course1 = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")


//    println(course)
    println("Checcking Object Equality ${course == course1}") //huge advantage of object equity

    val course3 = course1.copy(id = 3, author = "Dilip1")

    println(course3)
}
