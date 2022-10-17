package com.example.androidcourses2022

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.androidcourses2022.databinding.FragmentDialogBinding

class AlertFragment(private val onClick: (Int) -> Unit) : DialogFragment(R.layout.fragment_dialog) {

    private var binding: FragmentDialogBinding? = null
    private var num: Int = 0

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate((R.layout.fragment_dialog), null, false)
        binding = FragmentDialogBinding.bind(view)

        return AlertDialog.Builder(requireContext())
            .setTitle("Title")
            .setView(view)
            .setPositiveButton("Positive") { dialog, _ ->
                binding?.run {
                    if (etDialog.text == null) {
                        ilDialog.error = "error"
                        dialog.dismiss()
                    } else if (etDialog.text.toString().toInt() !in 0..100) {
                        ilDialog.error = "error"
                        dialog.dismiss()
                    } else {
                        num = etDialog.text.toString().toInt()
                        onClick(num)
                        dialog.dismiss()
                    }
                }
            }
            .setNegativeButton("Negative") { dialog, _ ->
                dialog.dismiss()
            }
            .setNeutralButton("Neutral") { dialog, _ ->
                num = -binding?.etDialog?.text.toString().toInt()
                onClick(num)
                dialog.dismiss()
            }
            .create()
    }

}