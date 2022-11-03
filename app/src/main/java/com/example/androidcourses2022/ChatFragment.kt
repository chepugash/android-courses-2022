package com.example.androidcourses2022

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.databinding.FragmentChatBinding

class ChatFragment : Fragment(R.layout.fragment_chat) {

    private var binding: FragmentChatBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}