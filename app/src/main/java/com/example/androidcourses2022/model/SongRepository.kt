package com.example.androidcourses2022.model

import com.example.androidcourses2022.R

object SongRepository {

    val songs = arrayListOf(
        Song(id = 0,
            name = "Еврейский портной",
            author = "Михаил Шуфутинский",
            cover = R.drawable.shufutinskiy,
            audio = R.raw.shufutinskiy,
            isPlaying = false,
            genre = "Шансон"),
        Song(id = 1,
            name = "А у реки",
            author = "Отпетые Мошенники",
            cover = R.drawable.ayreki,
            audio = R.raw.ayreki,
            isPlaying = false,
            genre = "Русский рейв"),
        Song(id = 2,
            name = "А для вас я никто",
            author = "Бутырка",
            cover = R.drawable.butirka,
            audio = R.raw.butirka,
            isPlaying = false,
            genre = "Шансон"),
        Song(id = 3,
            name = "Верните сотку",
            author = "АК-47 & 4К",
            cover = R.drawable.ak,
            audio = R.raw.ak,
            isPlaying = false,
            genre = "Реп"),
        Song(id = 4,
            name = "Фраер",
            author = "Михаил Круг",
            cover = R.drawable.krugfraer,
            audio = R.raw.krugfraer,
            isPlaying = false,
            genre = "Шансон"),
        Song(id = 5,
            name = "Сентиментальный детектив 2",
            author = "Иван Кучин",
            cover = R.drawable.kuchin,
            audio = R.raw.kuchin,
            isPlaying = false,
            genre = "Шансон"),
        Song(id = 6,
            name = "И упав на колени",
            author = "Юрий Шатунов",
            cover = R.drawable.upavnakoleni,
            audio = R.raw.upavnakoleni,
            isPlaying = false,
            genre = "Шансон")
    )

    fun getPlayingSongById(id: Int): Song {
        var playingSong = songs[0]
        for (song in songs) {
            if (song.id == id) {
                song.isPlaying = true
                playingSong = song
            } else {
                song.isPlaying = false
            }
        }
        return playingSong
    }

}