package com.example.androidcourses2022

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidcourses2022.databinding.FragmentStartBinding

class StartFragment : Fragment(R.layout.fragment_start) {

    private var binding: FragmentStartBinding? = null
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentStartBinding.bind(view)

        binding?.run {
            tvCounter.text = "Counter value: $counter"
            btnFirst.setOnClickListener {
                parentFragmentManager.beginTransaction()
                    .setCustomAnimations(
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                        android.R.anim.fade_in,
                        android.R.anim.fade_out,
                    )
                    .replace(R.id.container, SecondFragment.newInstance(counter))
                    .addToBackStack("Start")
                    .commit()
            }

            btnSecond.setOnClickListener {
                counter++
                tvCounter.text = "Counter value: $counter"
            }

            btnThird.setOnClickListener {
                val dialog = AlertFragment { num ->
                    counter += num
                    if (counter < 0) counter = 0
                    tvCounter.text = "Counter value: $counter"
                }
                dialog.show(parentFragmentManager, "Tag")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
