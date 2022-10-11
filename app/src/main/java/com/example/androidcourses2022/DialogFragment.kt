package com.example.androidcourses2022

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.example.androidcourses2022.databinding.FragmentDialogBinding

class DialogFragment : DialogFragment(R.layout.fragment_dialog) {

    private var binding: FragmentDialogBinding? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_dialog, null, false)
        binding = FragmentDialogBinding.bind(view)

        return AlertDialog.Builder(requireContext())
            .setTitle("Input number:")
            .setView(view)
            .setPositiveButton("ADD") { dialog, _ ->
                dialog.dismiss()
            }
            .setNegativeButton("CANCEL") { dialog, _ ->
                dialog.dismiss()
            }
            .setNeutralButton("SUBTRACT") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
    }

}