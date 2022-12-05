package com.example.androidcourses2022.model

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes

data class Song(
    val id: Int,
    val name: String,
    val author: String,
    @DrawableRes val cover: Int,
    @RawRes val audio: Int,
    var isPlaying: Boolean,
    val genre: String
)