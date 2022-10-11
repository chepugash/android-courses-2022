package com.example.androidcourses2022

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
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

        binding?.run {
            tvCounter?.text = "Counter value: $counter"
            if (counter in 0..50) { frSecond.setBackgroundColor(Color.parseColor("#F3E5F5")) }
            else if (counter in 51..100) { frSecond.setBackgroundColor(Color.parseColor("#E1BEE7")) }
            else { frSecond.setBackgroundColor(Color.parseColor("#CE93D8")) }
        }

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