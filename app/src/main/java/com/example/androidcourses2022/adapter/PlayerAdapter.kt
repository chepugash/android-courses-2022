package com.example.androidcourses2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.androidcourses2022.databinding.ItemPlayerBinding
import com.example.androidcourses2022.model.Player

class PlayerAdapter(
    private val list: List<Player>,
    private val glide: RequestManager,
    private val action: (Player) -> Unit
) : RecyclerView.Adapter<PlayerItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlayerItem = PlayerItem(
        binding = ItemPlayerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        action = action
    )

    override fun onBindViewHolder(
        holder: PlayerItem,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}