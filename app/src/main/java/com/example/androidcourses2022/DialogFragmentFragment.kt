package com.example.androidcourses2022

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.androidcourses2022.databinding.FragmentDialogBinding

class DialogFragmentFragment : DialogFragment(R.layout.fragment_dialog) {

    var num = 0
    private var binding: FragmentDialogBinding? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialogView = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_dialog, null, false)
        binding = FragmentDialogBinding.bind(dialogView)
        return showDialog(
            title = "Input number",
            view = dialogView,
            positiveAction = {
                num = binding?.etDialog?.text.toString().toInt()
//                if (isInputCorrect(binding?.etDialog?.text)) {
//                    val num = binding?.etDialog?.text.toString().toInt()
//                    arguments = Bundle().apply {
                val bundle = Bundle()
                bundle.putInt(ARG_NAME, num)
                val intent = Intent(context,StartFragment::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
//                    }

//                }
            },
            negativeAction = {
            },
            neutralAction = {
            }
        )
    }

    fun isInputCorrect(input: Editable?): Boolean {
        return input != null && input.toString().toIntOrNull() != null &&
                input.toString().toInt() >= 0 &&
                input.toString().toInt() <= 100
    }

    companion object {
        private const val ARG_NAME = "num"
//        fun newInstance(num: Int) = DialogFragmentFragment().apply {
//            arguments = Bundle().apply {
//                putInt(ARG_NAME, num)
//            }
//        }
        fun newInstance(fragmentManager: FragmentManager) {
            return DialogFragmentFragment().show(fragmentManager, "Tag")
}

    }


}