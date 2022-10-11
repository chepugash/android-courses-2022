package com.example.androidcourses2022

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private var binding: FragmentSecondBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)

        val counter =arguments?.getInt(ARG_NAME)
        binding?.tvCounter?.text = "Counter value: $counter"

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_NAME = "counter"

        fun newInstance(counter: Int) = SecondFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_NAME, counter)
            }
        }
    }

}