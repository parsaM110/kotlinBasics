package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.KAFKA
import com.example.gitircource.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

   /* val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

    val mapResult = list.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("mapResult: $mapResult")

    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("flatMapResult: $flatMapResult")*/


    //    exploreFilter(courseList, desPredicate)

    //   exploreMap(courseList,desPredicate)

    //val courses = exploreFlatMap(courseList, KAFKA)
    //println("kafka courses : $courses")

   // exploreHashMap()
    collection_nullability()

}

fun collection_nullability() {
    var list : MutableList<String>? = null

    list = mutableListOf() // when I put this ther is no need of list.? in using maps

    list.add("Dillip")
    list.forEach{
        println("value is $it")
    }


    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach{
        println("value Length is ${it?.length}")
    }

}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Dilip" to 33 , "Scooby" to 5)
    nameAgeMutableMap
        .forEach{
            (k,v) -> println("Key : $k and the value is $v")
        }

//    val value = nameAgeMutableMap.get("Dilip")
//    val value = nameAgeMutableMap["Dilip"]
    val value = nameAgeMutableMap.getOrElse("Dilip1"){"abc"}
    println("value is $value")

//    val result = nameAgeMutableMap.containsKey("abc") //give me false
    val result = nameAgeMutableMap.containsKey("Dilip")
    println("result is $result")

    val filteredMap = nameAgeMutableMap.filterKeys { it.length > 5 }
        .map {it.key.uppercase()}
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap.maxByOrNull { it.value }
    println("maxAge is $maxAge")

}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }
    return kafkaCourses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate) // no need to invoke when you use parentheses
        .map { "${it.name} - ${it.category}" }
        .forEach { println(it) }
//    println(courses)
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach { println("Courses : $it") }

//    println("developmentCourses : $developmentCourses")

}
