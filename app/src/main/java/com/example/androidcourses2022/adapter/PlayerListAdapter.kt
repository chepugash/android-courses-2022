package com.example.androidcourses2022.adapter

import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.RequestManager
import com.example.androidcourses2022.R
import com.example.androidcourses2022.model.MainItems
import com.example.androidcourses2022.model.PlayerRepository

class PlayerListAdapter(
    private val glide: RequestManager,
    private val action: (MainItems.Player) -> Unit
) : ListAdapter<MainItems, RecyclerView.ViewHolder>(object: DiffUtil.ItemCallback<MainItems>() {
    override fun areItemsTheSame(
        oldItem: MainItems,
        newItem: MainItems
    ): Boolean = (oldItem as? MainItems.Player)?.id == (newItem as? MainItems.Player)?.id

    override fun areContentsTheSame(
        oldItem: MainItems,
        newItem: MainItems
    ): Boolean = oldItem == newItem

}) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder = when (viewType) {
        R.layout.item_player -> PlayerItem.create(parent, glide, action)
        R.layout.item_advert -> AdvertItem.create(parent)
        else -> throw IllegalStateException("Unexpected item")
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        when (holder) {
            is PlayerItem -> holder.onBind(getItem(position) as MainItems.Player)
            is AdvertItem -> holder.onBind("Visit our store")
        }
    }

    override fun getItemViewType(position: Int): Int =
        when (getItem(position)) {
            is MainItems.Player -> R.layout.item_player
            is MainItems.Advert -> R.layout.item_advert
        }

}