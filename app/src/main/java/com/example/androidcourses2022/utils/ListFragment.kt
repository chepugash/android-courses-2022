package com.example.androidcourses2022.utils

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.androidcourses2022.R
import com.example.androidcourses2022.adapter.PlayerListAdapter
import com.example.androidcourses2022.adapter.SpaceItemDecorator
import com.example.androidcourses2022.databinding.FragmentListBinding
import com.example.androidcourses2022.model.MainItems
import com.example.androidcourses2022.model.PlayerRepository
import jp.wasabeef.recyclerview.adapters.SlideInBottomAnimationAdapter

class ListFragment : Fragment(R.layout.fragment_list) {
    private var binding: FragmentListBinding? = null
    private var adapter: PlayerListAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        binding?.run {
            val itemDecoration = SpaceItemDecorator(
                this@ListFragment,
                16.0f
            )
            adapter?.setHasStableIds(true)
            adapter = PlayerListAdapter(
                glide = Glide.with(this@ListFragment)
            ) {
                onPlayerClick(it)
            }
            rvPlayer.adapter = SlideInBottomAnimationAdapter(adapter!!)
            rvPlayer.addItemDecoration(itemDecoration)
            LeftSwipeDelete(adapter).attachToRecyclerView(rvPlayer)

            floatingActionButton.setOnClickListener {
                val dialog = DialogFragmentFragment { position, player ->
                    PlayerRepository.mainItems.add(position, player)
                    for (i in position until PlayerRepository.mainItems.size) {
                        if (PlayerRepository.mainItems[i] is MainItems.Advert
                            && i % 6 != 0) {
                            PlayerRepository.mainItems[i] = PlayerRepository.mainItems[i - 1].also {
                                PlayerRepository.mainItems[i - 1] = PlayerRepository.mainItems[i]
                            }
                        }
                    }
                    adapter?.notifyItemInserted(position)
                    adapter?.notifyItemRangeChanged(position, PlayerRepository.mainItems.size)
                    adapter?.submitList(PlayerRepository.mainItems)
                }
                dialog.show(parentFragmentManager, "Tag")
            }
            adapter?.submitList(PlayerRepository.mainItems) {
                rvPlayer.scrollToPosition(0)
            }
        }
    }

    private fun onPlayerClick(player: MainItems.Player) {
        val index = PlayerRepository.mainItems.indexOfFirst { (it as? MainItems.Player)?.id == player.id }
        PlayerRepository.deleteElem(index)
        adapter?.notifyItemRemoved(index)
        adapter?.notifyItemRangeChanged(index, PlayerRepository.mainItems.size)
        adapter?.submitList(PlayerRepository.mainItems)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}