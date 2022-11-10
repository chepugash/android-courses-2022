package com.example.androidcourses2022

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Color
import android.media.AudioAttributes
import android.media.MediaActionSound
import android.net.Uri
import android.opengl.Visibility
import android.os.Build

fun AlarmChanel(
    context: Context,
    notificationManager: NotificationManager,
    vibrations: LongArray,
    audioAttributes: AudioAttributes,
    sound: Uri,
    color: Int
) {

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        NotificationChannel(
            context.getString(R.string.default_notification_channel_id),
            context.getString(R.string.default_notification_channel_name),
            NotificationManager.IMPORTANCE_HIGH,
        ).apply {
            lightColor = color
            vibrationPattern = vibrations
            setSound(sound, audioAttributes)
        }.also {
            notificationManager.createNotificationChannel(it)
        }
    }

}