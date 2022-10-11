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
//                val mView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_dialog, null, false)
//                showD(mView)
                DialogFragmentFragment.newInstance(parentFragmentManager)
                val bundle = intent

// performing the safety null check
                var s:String? = null

// getting the string back
                s = bundle!!.getString("key1", "Default"))

            }
        }

    }


    override fun onResume() {
        super.onResume()
        println(arguments?.getInt("num").toString())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun showD(mView: View) {
        showDialog(
            title = "Input Number",
            view = mView,
            positiveAction = {

            },
            negativeAction = {},
            neutralAction = {},
        )
    }

}
