package com.example.androidcourses2022

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.androidcourses2022.databinding.FragmentDialogBinding

class AlertFragment(private val onClick: (Int) -> Unit) : DialogFragment(R.layout.fragment_dialog) {

    private var binding: FragmentDialogBinding? = null
    private var num: Int = 0
    private var dialog: AlertDialog? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val view = LayoutInflater.from(requireContext()).inflate((R.layout.fragment_dialog), null, false)
        binding = FragmentDialogBinding.bind(view)

        return AlertDialog.Builder(requireContext())
            .setTitle("Title")
            .setView(view)
            .setPositiveButton("сложить", null)
            .setNegativeButton("Закрыть", null)
            .setNeutralButton("вычесть", null)
            .create().also { dialog = it }
    }

    override fun onStart() {
        super.onStart()

        dialog?.getButton(AlertDialog.BUTTON_POSITIVE)?.setOnClickListener {
            binding?.run {
                if (etDialog.text == null || etDialog.text.toString().toIntOrNull() == null
                    || etDialog.text.toString().toIntOrNull() !in 0..100) {
                    ilDialog.error = "Неверный формат данных"
                } else {
                    num = etDialog.text.toString().toInt()
                    onClick(num)
                    dialog?.dismiss()
                }
            }
        }

        dialog?.getButton(AlertDialog.BUTTON_NEGATIVE)?.setOnClickListener {
            binding?.run {
                num = 0
                onClick(num)
                dialog?.dismiss()
            }
        }

        dialog?.getButton(AlertDialog.BUTTON_NEUTRAL)?.setOnClickListener {
            binding?.run {
                if (etDialog.text == null || etDialog.text.toString().toIntOrNull() == null
                    || etDialog.text.toString().toIntOrNull() !in 0..100) {
                    ilDialog.error = "Неверный формат данных"
                } else {
                    num = -etDialog.text.toString().toInt()
                    onClick(num)
                    dialog?.dismiss()
                }
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}