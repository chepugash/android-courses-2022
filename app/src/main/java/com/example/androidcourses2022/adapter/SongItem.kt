package com.example.androidcourses2022.adapter

import android.graphics.Color
import android.opengl.Visibility
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.ItemSongBinding
import com.example.androidcourses2022.model.Song

class SongItem(
    private val binding: ItemSongBinding,
    private val action: (Song) -> Unit
): RecyclerView.ViewHolder(binding.root) {

    fun onBind(song: Song) {
        with(binding) {
            tvName.text = song.name
            tvAuthor.text = song.author
            ivPic.setImageResource(song.cover)
            if (song.isPlaying) {
                ivPlaying.visibility = View.VISIBLE
                root.setBackgroundColor(Color.parseColor("#3C3F41"))
            }
            root.setOnClickListener {
                action(song)
            }
        }
    }

}