package com.example.androidcourses2022.utils

import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.androidcourses2022.adapter.PlayerListAdapter
import com.example.androidcourses2022.model.PlayerRepository

class LeftSwipeDelete(
    adapter: PlayerListAdapter?
): ItemTouchHelper(object : SimpleCallback(0, ItemTouchHelper.LEFT) {
    override fun onMove(
        recyclerView: RecyclerView,
        viewHolder: RecyclerView.ViewHolder,
        target: RecyclerView.ViewHolder
    ): Boolean = false

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val index = viewHolder.adapterPosition
        PlayerRepository.deleteElem(index)
        adapter?.notifyItemRemoved(index)
        adapter?.notifyItemRangeChanged(index, PlayerRepository.mainItems.size)
        adapter?.submitList(PlayerRepository.mainItems)
    }
}) {

}