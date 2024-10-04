package com.example.kotlinpractice

fun main() {
    helloWorld()

    println(add(4, 5))

//    String Template

    val name = "Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName} I'm 23")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")

    checkNum(1)

    forAndWhile()

    nullcheck()

    ignoreNulls("null")
}

// Function

fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

// val vs var

fun hi() {
    val a: Int = 10
    var b: Int = 9

    var e: String

    b = 100

    val c = 100
    var d = 100
    var name = "Joyce"
}

// condition

fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
//        else -> println("I don't know")
    }

    var b = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b: ${b}")

    when (score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

// Array and List

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

// For / While

fun forAndWhile() {

    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1 .. 100) {
        sum += i
    }
    println(sum)

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}

// Nullable / NonNull

fun nullcheck() {

    var name = "joyce"

    var nullName : String? = null

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()

//    ?:

    val lastName : String? = "Hong"

    val fullName = name + " " + (lastName ?: "No lastName")

    println(fullName)

//    !!

}

fun ignoreNulls(str : String?) {
    val mNotNull : String = str!!
    val upper= mNotNull.uppercase()

    val email : String? = "joycehongXXXX@nana.com"
    email?.let{
        println("my email is ${it}")
    }
}