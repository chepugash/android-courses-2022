package com.example.androidcourses2022.utils

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.R
import com.example.androidcourses2022.adapter.SongAdapter
import com.example.androidcourses2022.adapter.SpaceItemDecorator
import com.example.androidcourses2022.databinding.FragmentSongListBinding
import com.example.androidcourses2022.model.SongRepository

class SongListFragment : Fragment(R.layout.fragment_song_list) {
    private var binding: FragmentSongListBinding? = null
    private var adapter: SongAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSongListBinding.bind(view)

        binding?.run {
            val itemDecoration = SpaceItemDecorator(
                this@SongListFragment,
                16.0f
            )

            adapter = SongAdapter(
                SongRepository.songs
            ) {
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                    )
                    .replace(R.id.container, SongFragment.newInstance(it.id))
                    .addToBackStack("list")
                    .commit()
            }
            rvSong.adapter = adapter!!
            rvSong.addItemDecoration(itemDecoration)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}