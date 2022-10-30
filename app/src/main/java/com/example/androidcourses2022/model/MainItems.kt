package com.example.androidcourses2022.model

sealed interface MainItems {
    data class Advert(val text: String, val pic: String) : MainItems

    data class Player(
        val id: Int,
        val name: String,
        val number: Int,
        val position: String,
        val age: Int,
        val nationality: String,
        val bio: String,
        val pic: String
    ) : MainItems
}