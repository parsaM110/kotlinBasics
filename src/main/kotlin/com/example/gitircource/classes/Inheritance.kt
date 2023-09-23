package com.example.gitircource.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false

    open fun login() {
        println("inside user Login: $name")
    }

    private fun secret(){
        println("Inside user secret")
    }

    open protected fun logout(){
        println("Inside user logout")
    }
}


class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object {
        const val noOfEnrolledCources = 10
        fun country() = "USA"
    }
    override fun login() {
        println("inside student Login: $name") // this is the override thing
        super.login()
    }

    override fun logout(){
        super.logout()
        println("inside student logout")
    }


}

class Instructor(name: String) : User(name)

fun main() {

    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")

    val country = Student.country()
    println("\u001B[91m" + "Country is $country" + "\u001B[0m")
    println("\u001B[33m" + "noOfEnrolledCources is ${Student.noOfEnrolledCources}" + "\u001B[0m")



    val instructor = Instructor("Dilip")
    println("name is ${instructor.name}")
    instructor.login()

    val user = User("Dilip")


}