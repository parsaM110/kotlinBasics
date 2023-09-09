package com.example.gitircource.classes

class Item() {
    var name: String  = ""

    constructor(_name: String) : this(){
        name = _name
    }

}

fun main() {
    val item = Item("Iphone")
    println("Item is ${item.name}")
    item.name = "Iphone 13"
    println("Item is ${item.name}")
}