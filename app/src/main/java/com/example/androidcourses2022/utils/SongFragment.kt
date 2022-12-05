package com.example.androidcourses2022.utils

import android.media.MediaDrm.PlaybackComponent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.FragmentSongBinding
import com.example.androidcourses2022.model.SongRepository

class SongFragment : Fragment(R.layout.fragment_song) {
    private var binding: FragmentSongBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSongBinding.bind(view)

        val id = arguments?.getInt(ARG_NAME)

        binding?.run {
            if (id != null) {
                val song = SongRepository.getPlayingSongById(id)

                tvSongAuthor.text = song.author
                tvSongName.text = song.name
                ivLabel.setImageResource(song.cover)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_NAME = "id"

        fun newInstance(id: Int) = SongFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_NAME, id)
            }
        }
    }
}