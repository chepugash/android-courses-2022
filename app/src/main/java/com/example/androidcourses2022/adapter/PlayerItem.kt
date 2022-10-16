package com.example.androidcourses2022.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Priority
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.ItemPlayerBinding
import com.example.androidcourses2022.model.Player

class PlayerItem(
    private val binding: ItemPlayerBinding,
    private val glide: RequestManager,
    private val action: (Player) -> Unit
): RecyclerView.ViewHolder(binding.root) {

    private val option = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.ALL)
        .priority(Priority.HIGH)

    fun onBind(player: Player) {
        with(binding) {
            tvName.text = player.name
            tvPosition.text = player.position
            glide
                .load(player.pic)
                .apply(option)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(ivPic)
            root.setOnClickListener {
                action(player)
            }
        }
    }

}