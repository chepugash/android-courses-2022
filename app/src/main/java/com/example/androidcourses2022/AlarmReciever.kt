package com.example.androidcourses2022

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReciever : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            val notificationProvider = NotificationProvider(it)
            notificationProvider.showNotification(
                title = "Проснись",
                text = "Тебе к первой паре..."
            )
        }
    }

}