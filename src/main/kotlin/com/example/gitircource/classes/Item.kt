package com.example.gitircource.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
        //        get() = field
        get() {
            println("Inside Getter")
            return field
        }
        set(value) {
            if(value>=0.0){
                println("Inside Setter")
                field = value
            }
            else{
                throw IllegalArgumentException("Negetive price is not allowed")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }

}

fun main() {

    val item = Item("Iphone")
    println("Item is ${item.name}")
    item.name = "Iphone 13"
    println("Item is ${item.name}")

    item.price = -10.0

    println(item.price)
}