package com.example.androidcourses2022

import android.app.AlertDialog
import android.app.Dialog
import android.view.View
import androidx.fragment.app.Fragment

typealias Click = () -> Unit

fun Fragment.showDialog(
    title: String = "",
    message: String = "",
    view: View? = null,
    positiveAction: Click? = null,
    negativeAction: Click? = null,
    neutralAction: Click? = null,
): Dialog {
   return AlertDialog.Builder(requireContext())
        .setTitle(title)
        .setView(view)
        .setMessage(message)
        .setPositiveButton("ADD") { dialog, _ ->
            positiveAction?.invoke()
            dialog.dismiss()
        }
        .setNegativeButton("CANCEL") { dialog, _ ->
            negativeAction?.invoke()
            dialog.dismiss()
        }
        .setNeutralButton("DIV") { dialog, _ ->
            neutralAction?.invoke()
            dialog.dismiss()
        }
        .create()
}