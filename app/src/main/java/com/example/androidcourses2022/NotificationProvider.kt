package com.example.androidcourses2022
import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioAttributes
import android.net.Uri
import android.os.Build
import androidx.core.app.NotificationCompat

class NotificationProvider(private val context: Context) {

//    @SuppressLint("UseCompatLoadingForDrawables")
    fun showNotification(title: String, text: String) {
        val notificationManager:NotificationManager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val intent = Intent(context, WakeupActivity::class.java)
        val pending = PendingIntent.getActivity(
            context,
            100,
            intent,
            PendingIntent.FLAG_ONE_SHOT,
        )

        val vibrations = arrayOf(1000L, 1000L, 1000L, 1000L, 1000L).toLongArray()
        val audioAttributes: AudioAttributes = AudioAttributes.Builder()
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .setUsage(AudioAttributes.USAGE_NOTIFICATION)
            .build()
        val sound: Uri = Uri.parse(
            "android.resource://" + context.packageName + "/" + R.raw.alarm
        )
        val color = Color.GREEN

        val builder: NotificationCompat.Builder =
            NotificationCompat.Builder(
                context,
                context.getString(R.string.default_notification_channel_id)
            )
                .setSmallIcon(R.drawable.ic_baseline_access_alarms_24)
                .setContentTitle(title)
                .setContentText(text)
                .setAutoCancel(true)
                .setContentIntent(pending)
                .setCategory(NotificationCompat.CATEGORY_ALARM)
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            AlarmChanel(
                context,
                notificationManager,
                vibrations,
                audioAttributes,
                sound,
                color
            )
        } else {
            builder.setLights(color, 100, 500)
            builder.setVibrate(vibrations)
            builder.setSound(sound)
        }

        notificationManager.notify(1111, builder.build())

    }

}