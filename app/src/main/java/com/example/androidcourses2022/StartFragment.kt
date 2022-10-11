package com.example.androidcourses2022

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.androidcourses2022.databinding.FragmentStartBinding

class StartFragment : Fragment(R.layout.fragment_start) {

    private var binding: FragmentStartBinding? = null
    private var counter = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStartBinding.bind(view)

        binding?.run {

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
            }

            btnThird.setOnClickListener {
                DialogFragment().show(parentFragmentManager, "TAG")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}
