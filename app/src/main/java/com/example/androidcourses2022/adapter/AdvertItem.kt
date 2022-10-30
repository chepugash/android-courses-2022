package com.example.androidcourses2022.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcourses2022.databinding.ItemAdvertBinding

class AdvertItem(
    private val binding: ItemAdvertBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(text: String) {
        binding.tvAdvert.text = text
    }

    companion object {
        fun create(parent: ViewGroup): AdvertItem = AdvertItem(
            binding = ItemAdvertBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

}