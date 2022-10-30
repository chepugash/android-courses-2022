package com.example.androidcourses2022.utils

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.FragmentDialogBinding

class DialogFragmentFragment : DialogFragment(R.layout.fragment_dialog) {

    private var binding: FragmentDialogBinding? = null
    private var dialog: AlertDialog? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate((R.layout.fragment_dialog), null, false)
        binding = FragmentDialogBinding.bind(view)
        return AlertDialog.Builder(requireContext())
            .setTitle("Новый игрок")
            .setView(view)
            .setPositiveButton("ОК", null)
            .setNegativeButton("Отмена", null)
            .create().also { dialog = it }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}