package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }
//    explorefilter(courseList, desPredicate)

    exploreMap(courseList,desPredicate)
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate) // no need to invoke when you use parentheses
        .map{ "${it.name} - ${it.category}"}
        .forEach{println(it)}
//    println(courses)
}

fun explorefilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach { println("Courses : $it") }

//    println("developmentCourses : $developmentCourses")

}
