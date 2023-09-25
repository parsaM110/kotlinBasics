package com.example.gitircource.collections

fun main(){
    val names = listOf("Alex","Ben","Chole")
    println("Names : $names")

    val namesMutableList= mutableListOf("Alex","Ben","Chole")
    namesMutableList.add("Adam")
    println("Names : $namesMutableList")

    val set =  setOf("Alex","Ben","Chole")
    println("Set : $set")

    val mutableSet =  mutableSetOf("Alex","Ben","Chole")
    mutableSet.add("Adam")
    println("mutableSet after  : $mutableSet")

    val nameAgeMap = mapOf("Dilip" to 34,"Scoopy" to 4 )
    println("\u001B[35m" + "nameAgeMap  : $nameAgeMap" + "\u001B[0m")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34,"Scoopy" to 4 )
//    nameAgeMutableMap.put("abc" , 100) //better approch below
    nameAgeMutableMap["abc"] = 100
    println("\u001B[35m" + "nameAgeMutableMap  : $nameAgeMutableMap" + "\u001B[0m")

}