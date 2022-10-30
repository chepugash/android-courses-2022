package com.example.androidcourses2022.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.androidcourses2022.R
import com.example.androidcourses2022.model.MainItems

class PlayerWithHeaderAdapter(
    private var list: List<MainItems>,
    private val glide: RequestManager,
    private val action: (MainItems.Player) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder = when (viewType) {
        R.layout.item_advert -> AdvertItem.create(parent)
        R.layout.item_player -> PlayerItem.create(parent, glide, action)
        else -> throw IllegalStateException("Error")
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        when (holder) {
            is PlayerItem -> holder.onBind((list[position] as MainItems.Player))
            is AdvertItem -> holder.onBind((list[position] as MainItems.Advert).text)
        }
    }

    override fun getItemCount(): Int = list.size

    override fun getItemId(position: Int): Long {
        return when (val item = list[position]) {
            is MainItems.Player -> item.id.toLong()
            is MainItems.Advert -> super.getItemId(position)
        }
    }

    fun updateDataSet(new: List<MainItems>) {
        list = new
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return when {
            list[position] is MainItems.Player -> R.layout.item_player
            list[position] is MainItems.Advert -> R.layout.item_advert
            else -> throw IllegalStateException("Error")
        }
    }

}