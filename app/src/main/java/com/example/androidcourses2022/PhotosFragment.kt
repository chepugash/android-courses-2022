package com.example.androidcourses2022

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.databinding.FragmentPhotosBinding

class PhotosFragment : Fragment(R.layout.fragment_photos) {

    private var binding: FragmentPhotosBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPhotosBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}