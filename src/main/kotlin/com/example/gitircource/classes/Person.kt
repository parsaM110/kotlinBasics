package com.example.gitircource.classes

class Person(val name: String = "", val age: Int = 0) {

    var email: String = ""

    constructor(_email: String, _name: String = "", _age: Int) : this() {
        email = _email
    }

    fun action() {
        println("Person walks")
    }

}

fun main() {
    val person = Person("Alex", 25)
    person.action()
    println("Name : ${person.name} and Age: ${person.age}")

    val person1 = Person()
    person.action()
    println("Name : ${person1.name} and Age: ${person1.age}")

    val person2 = Person(name = "Alex", age = 86)
    person.action()
    println("Name : ${person2.name} and Age: ${person2.age}")

    val person3 = Person( _email = "abc@gmail.com","Alex", 26)
    println("Name ${person3.name} and Age: ${person3.age} and email is ${person3.email}")
}