package com.example.gitircource.basics

fun  main(){
    for(i in 1..5){
        println("i in $i")
        if(i == 3)return//break
    }

    println("<<<<<<<<<<<<<<<<<<<<<*>>>>>>>>>>>>>>>>>>>>>")

    label()

    println("end")
}

fun label() {
    loop@ for(i in 1..5){
        println("i in loop $i")
        //if(i == 3) break@loop
        innerloop@ for(j in 1..5) {
            println("j in loop $j")
            if(j==2)break@innerloop
        }

    }
}
