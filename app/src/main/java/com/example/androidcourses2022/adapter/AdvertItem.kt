package com.example.androidcourses2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.ItemAdvertBinding
import com.example.androidcourses2022.model.MainItems

class AdvertItem(
    private val binding: ItemAdvertBinding,
    private val glide: RequestManager
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(advert: MainItems.Advert) {
        with(binding) {
            tvAdvert.text = advert.text
            glide
                .load(advert.pic)
                .placeholder(R.drawable.logo)
                .error(R.drawable.logo)
                .into(ivAdvert)
        }
    }

    companion object {
        fun create(parent: ViewGroup, glide: RequestManager): AdvertItem = AdvertItem(
            binding = ItemAdvertBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            glide = glide
        )
    }

}