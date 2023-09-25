package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.KAFKA
import com.example.gitircource.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

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

    println("flatMapResult: $flatMapResult")


    //    exploreFilter(courseList, desPredicate)

    //   exploreMap(courseList,desPredicate)

    val courses = exploreFlatMap(courseList, KAFKA)
    println("kafka courses : $courses")

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
