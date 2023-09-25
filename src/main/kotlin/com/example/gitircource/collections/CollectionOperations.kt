package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.courseList

fun main() {
    val courseList = courseList()
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    explorefilter(courseList, devPredicate)
}

fun explorefilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    val developmentCourses = courseList
//        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .filter { predicate.invoke(it) }
        .forEach { println("developmentCourses : $it") }

//    println("developmentCourses : $developmentCourses")

}
