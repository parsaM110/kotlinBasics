package com.example.gitircource.functions

import java.time.LocalDate

fun printName(name: String): Unit { // if you say noting it will be Unit basically it is null

    println("Name is $name")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionApprouch1(x: Int, y: Int): Int = x + y

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("name is $name and the email is $email and the dob is $dob")

}

fun main() {
//    val unit = printName("Dilip")
//    printName("unit is $unit")
//
//    val result = addition(1, 2)
//    println("result is $result")
//
//    val result1 = additionApprouch1(1, 2)
//    println("result is $result1")

    printPersonDetails("Dilip", "p@mail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Hassan")
    printPersonDetails(name = "Dilip", dob = LocalDate.parse("2000-01-02") )
}




