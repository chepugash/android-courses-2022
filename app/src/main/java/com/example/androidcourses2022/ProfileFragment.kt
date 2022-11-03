package com.example.androidcourses2022

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.androidcourses2022.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        val controller = findNavController()
        binding?.run {
            btnMusic.setOnClickListener {
                controller.navigate(R.id.action_profileFragment_to_musicFragment)
            }
            btnPhotos.setOnClickListener {
                controller.navigate(R.id.action_profileFragment_to_photosFragment)
            }
            btnVideos.setOnClickListener {
                controller.navigate(R.id.action_profileFragment_to_videosFragment)
            }
            btnSearch.setOnClickListener {
                controller.navigate(R.id.action_profileFragment_to_searchFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}