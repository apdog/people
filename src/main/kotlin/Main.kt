package ru.netology

fun main() {
    val likes = 5
    val likesStr = if (likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $likesStr")
}