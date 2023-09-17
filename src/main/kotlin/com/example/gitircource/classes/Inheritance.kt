package com.example.gitircource.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("inside user Login: $name")
    }
}


class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        println("inside student Login: $name") // this is the override thing
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")
    val instructor = Instructor("Dilip")
    println("name is ${instructor.name}")
    instructor.login()

}