package com.example.gitircource.classes

data class Course(val id: Int, val name: String, val author: String, val courseCategory: CourseCategory = CourseCategory.DEVELOPMENT)

enum class CourseCategory{
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}
fun main() {
    val course = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")

    val course1 = Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip")


//    println(course)
    println("Checcking Object Equality ${course == course1}") //huge advantage of object equity

    val course3 = course1.copy(id = 3, author = "Dilip1")

    println(course3)

    val marketingCourse = Course(2,"Facebook Marketing", "Dilip",CourseCategory.MARKETING)

    println(marketingCourse)
}
