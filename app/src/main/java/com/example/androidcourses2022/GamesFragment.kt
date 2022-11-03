package com.example.androidcourses2022

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.databinding.FragmentGamesBinding

class GamesFragment : Fragment(R.layout.fragment_games) {

    private var binding: FragmentGamesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGamesBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}