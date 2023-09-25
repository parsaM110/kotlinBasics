package com.example.gitircource.collections

import com.example.gitircource.dataset.Course
import com.example.gitircource.dataset.CourseCategory
import com.example.gitircource.dataset.courseList

fun main() {
    val courseList = courseList()
    explorefilter(courseList)
}

fun explorefilter(courseList: MutableList<Course>) {

    val developmentCourses = courseList
        .filter { it.category == CourseCategory.DEVELOPEMENT }
        .forEach { println("developmentCourses : $it") }

//    println("developmentCourses : $developmentCourses")

}
