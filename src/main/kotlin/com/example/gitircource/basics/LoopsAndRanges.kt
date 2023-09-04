package com.example.gitircource.basics

fun main(){
    val range=1..10

    for (i in range){
        println("i : $i")
    }

    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>>>>>>>")


    val  reverseRange = 10 downTo 1

    for (i in reverseRange){
        println("reverseRange : $i")
    }

    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    for (i in reverseRange step 2){
        println("reverseRange with skip : $i")
    }

}