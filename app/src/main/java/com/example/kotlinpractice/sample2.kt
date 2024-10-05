package com.example.kotlinpractice

// Lambda

val square = { number: Int -> number * number }

val nameAge = { name: String, age: Int ->
    "my name is ${name}, I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("joyce", 99))
    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))
    println(calculateGrade(971))

    val lambda = { number: Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))

    println(invokeLambda { it > 3.22 })
}

// extension function

val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name: String, age: Int): String {

    val introduceMyself: String.(Int) -> String = { "I am ${this} and ${it} years old" }
    return name.introduceMyself(age)
}

// Return of Lambda

val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// Several ways to express lambda.

fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(5.2343)
}