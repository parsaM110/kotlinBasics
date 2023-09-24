package com.example.gitircource.nulls

data class Movie(
    val id : Int?,
    val name : String
)

fun printName(name: String){
    println("\u001B[43m" + "Name is $name" + "\u001B[0m")
}

fun printName1(name: String?){
    println("\u001B[43m" + "Name is $name" + "\u001B[0m")
}


fun main() {
    var nameNullable : String? = null

//    printName(nameNullable!!)

//    nameNullable?.let { printName(it) }

    nameNullable?.run { printName(this) }

//    if (nameNullable != null) {
//        println("Value is : ${nameNullable.length}")
//    }

    println("Value is : ${nameNullable?.length}") //safe operator ?
    val lenght = nameNullable?.length ?: 0 // Elvis operator
    val lenght2 = nameNullable?.length?.toLong() ?: 0 // Elvis and toLong
    println("\u001B[31m" + "Value is : $lenght" + "\u001B[0m")
    nameNullable ="Alex"
    val lenght1 = nameNullable.length //here it is not null no more so no need for saftey check
    println("Value is : $lenght1")

    nameNullable = "Dilip"
    println("Value is : $nameNullable")

    var name : String  = "Dilip"
    printName1(name)

    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) // non null assertions
    println("Saved Movie : $savedMovie")

}

fun saveMovie(movie: Movie)  : Movie {
//    return movie.copy(id = 1)
    return movie
}
