package com.example.gitircource.basics

fun main(){

   //if-else
   //when

    val name = "Aluex"

    val result = if(name.length == 4){
        println("y")
        name.length
    }else{
        println("n")
        name.length
    }

    println("result : $result")


    // swtich like thing

    val position = 7

//    val medal = if(position == 1){
//        "GOLD"
//    }else if(position==2){
//        "SILVER"
//    }else if(position==3){
//        "BRONZE"
//    }else{
//        "Nothing"
//    }

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "Nothing"
    }

    print(medal)






}