package com.example.androidcourses2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcourses2022.databinding.ItemSongBinding
import com.example.androidcourses2022.model.Song

class SongAdapter(
    private val list: List<Song>,
    private val action: (Song) -> Unit
) : RecyclerView.Adapter<SongItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SongItem = SongItem(
        binding = ItemSongBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        action = action
    )

    override fun onBindViewHolder(
        holder: SongItem,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}