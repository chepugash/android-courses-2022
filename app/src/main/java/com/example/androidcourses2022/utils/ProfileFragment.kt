package com.example.androidcourses2022.utils

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.FragmentProfileBinding
import com.example.androidcourses2022.model.PlayerRepository

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        val id = arguments?.getInt(ARG_NAME)

        binding?.run {
            if (id != null) {
                val player = PlayerRepository.players[id]

                tvId.text = "ID: $id"
                tvName.text = "Name: ${player.name}"
                tvNumber.text = "Number: ${player.number}"
                tvPosition.text = "Position: ${player.position}"
                tvPosition.text = "Position: ${player.position}"
                tvAge.text = "Age: ${player.age}"
                tvNationality.text = "Nationality: ${player.nationality}"
                tvBio.text = "Biography: ${player.bio}"

                collapsingBar.title = player.name

                Glide.with(this@ProfileFragment)
                    .load(player.pic)
                    .placeholder(R.drawable.logo)
                    .error(R.drawable.logo)
                    .into(ivPic)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_NAME = "id"

        fun newInstance(id: Int) = ProfileFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_NAME, id)
            }
        }
    }

}