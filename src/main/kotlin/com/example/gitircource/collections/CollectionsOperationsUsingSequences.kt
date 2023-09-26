package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.courseList

fun main() {
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val namesListUsingSequence = listOf("alex", "ben", "chole")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("namesListUsingSequence : $namesListUsingSequence")

    exploreFilterUsingSequence(courseList(), devPredicate)


    val range = 1..1000_000_000

//    range
//        .map { it.toDouble() }
//        .forEach { println("Valuse is : $it") } //error

    range
        .asSequence()
        .take(40)
        .map { it.toDouble() }
        .forEach { println("Valuse is : $it") }


}

fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    val developmentCourses = courseList
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach { println("Courses : $it") }

//    println("developmentCourses : $developmentCourses")

}