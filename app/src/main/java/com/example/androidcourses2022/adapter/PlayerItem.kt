package com.example.androidcourses2022.adapter

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Priority
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.ItemPlayerBinding
import com.example.androidcourses2022.model.MainItems
import com.example.androidcourses2022.model.PlayerRepository

class PlayerItem(
    private val binding: ItemPlayerBinding,
    private val glide: RequestManager,
    private val action: (MainItems.Player) -> Unit
): RecyclerView.ViewHolder(binding.root) {

    private var player: MainItems.Player? = null

    private val option = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)
        .priority(Priority.HIGH)


    fun onBind(player: MainItems.Player) {
        this.player = player
        with(binding) {
            tvName.text = player.name
            tvPosition.text = player.position
            glide
                .load(player.pic)
                .apply(option)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(ivPic)
//            root.setOnClickListener {
//                action(player)
//            }
            ivDel.setOnClickListener {
                action(player)
            }
        }
    }

    companion object {
        const val ARG_POSITION = "arg_position"

        fun create(
            parent: ViewGroup,
            glide: RequestManager,
            action: (MainItems.Player) -> Unit
        ): PlayerItem = PlayerItem(
            binding = ItemPlayerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            action = action
        )
    }

}