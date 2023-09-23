package com.example.gitircource.interfaces

import com.example.gitircource.classes.Course

interface CourseRepository {

    val isCoursePersisted: Boolean
    fun getbyId(id: Int): Course

    fun save(course: Course): Int {
        println("course : $course")
        return course.id
    }

}

interface Repository {
    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override var isCoursePersisted: Boolean = false


    override fun getbyId(id: Int): Course {
        return Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip");
    }

    override fun save(course: Course): Int {
        isCoursePersisted = true
        return super.save(course)
    }

    override fun getAll(): Any {
        return 1
    }

}

class NoSqlCourseRepository : CourseRepository {
    override val isCoursePersisted: Boolean = false


    override fun getbyId(id: Int): Course {
        return Course(1, "Reactive Programming in Modern Java using Project Reactor", "Dilip");
    }

    override fun save(course: Course): Int {
        println("course in NoSqlCourseRepository : $course")
//        return super.save(course)
        return course.id
    }

}

interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B {
    fun doSomething() {
        println("doSomething in B")
    }
}


class AB : A, B {

    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getbyId(1)
    println("Course is $course")
    val courseId =
        sqlCourseRepository.save(Course(5, "Reactive Programming in Modern Java using Project Reactor", "Dilip"))
    println("Course persisted value is ${sqlCourseRepository.isCoursePersisted}")
    println("Saved Course  Id is : $courseId")

    val nosqlCourseRepository = NoSqlCourseRepository()
    val course1 = nosqlCourseRepository.getbyId(1)
    println("Course is $course1")
    val savedCourseId =
        nosqlCourseRepository.save(Course(6, "Reactive Programming in Modern Java using Project Reactor", "Dilip"))
    println("Saved Course  Id is in nosqlCourseRepository: $savedCourseId")


    val ab = AB()
    ab.doSomething()


}