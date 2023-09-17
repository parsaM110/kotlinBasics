package com.example.gitircource.classes

object Authenticate {
    fun authenticate(userName: String, password: String){
        println("User authenticate for userName: $userName")
    }
}

fun main(){
    Authenticate.authenticate("Dilip","abc")
}