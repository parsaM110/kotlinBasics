package com.example.gitircource.exception

import javax.management.RuntimeErrorException


fun returnNothing() : Nothing{
    throw RuntimeException("Exception")
}

fun main() {
    println("   Name Length is ${nameLength("Dillip")}")
    println("   Name Length is ${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?): Int? {
//    try {                       //cmd + alt + T : try catch
//        return name!!.length
//    } catch (e: Exception) {
//        println("exception is : $e")
//        return null
//    }


   /* return try {                       //cmd + alt + T : try catch
         name!!.length
    } catch (e: Exception) {
        println("exception is : $e")
         null
    }*/

     val result =  try {                       //cmd + alt + T : try catch
        name!!.length
   } catch (e: Exception) {
       println("exception is : $e")
        null
   }

    return result

}
