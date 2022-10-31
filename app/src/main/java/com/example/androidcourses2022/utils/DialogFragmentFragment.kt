package com.example.androidcourses2022.utils

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.FragmentDialogBinding
import com.example.androidcourses2022.model.MainItems
import com.example.androidcourses2022.model.PlayerRepository

class DialogFragmentFragment(
    private val onClick: (Int, MainItems.Player) -> Unit
) : DialogFragment(R.layout.fragment_dialog) {

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

    override fun onStart() {
        super.onStart()

        dialog?.getButton(AlertDialog.BUTTON_POSITIVE)?.setOnClickListener {
            binding?.run {
                val position = if (etPosition.text == null || etPosition.text.toString().toIntOrNull() == null
                    || (etPosition.text.toString().toIntOrNull() != null
                            && etPosition.text.toString().toInt() !in 0..PlayerRepository.mainItems.size)) {
                    PlayerRepository.mainItems.size
                } else etPosition.text.toString().toInt()

                if (etTitle.text != null && etDescription.text != null) {
                    val player = MainItems.Player(
                        id = 100 + position,
                        name = etTitle.text.toString(),
                        number = 0,
                        position = etDescription.text.toString(),
                        age = 0,
                        nationality = "",
                        bio = "",
                        pic = ""
                    )
                    onClick(position, player)
                    dialog?.dismiss()
                } else {
                    ilDescription.error = "Некорректные данные"
                    ilTitle.error = "Некорректные данные"
                }
            }
        }

        dialog?.getButton(AlertDialog.BUTTON_NEGATIVE)?.setOnClickListener {
            binding?.run {
                dialog?.dismiss()
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}