package com.example.androidcourses2022

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcourses2022.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var notificationProvider: NotificationProvider? = null
    private lateinit var alarmManager: AlarmManager
    private lateinit var pending: PendingIntent

    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        binding?.run {
            tvTime.text = SimpleDateFormat("HH:mm").format(calendar.time)
            tvDate.text = SimpleDateFormat("EE, dd MMMM").format(calendar.time)
            tvTime.setOnClickListener {
                val timeSetListener = TimePickerDialog
                    .OnTimeSetListener { timePicker, hour, minute ->
                        calendar.set(Calendar.HOUR_OF_DAY, hour)
                        calendar.set(Calendar.MINUTE, minute)
                        calendar.set(Calendar.SECOND, 0)
                        calendar.set(Calendar.MILLISECOND, 0)
                        tvTime.text = SimpleDateFormat("HH:mm").format(calendar.time)
                    }
                TimePickerDialog(
                    this@MainActivity,
                    timeSetListener,
                    calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE),
                    true
                ).show()
            }

            tvDate.setOnClickListener {
                val dateSetListener = DatePickerDialog
                    .OnDateSetListener { datePicker, year, month, dayOfMonth ->
                        calendar.set(Calendar.YEAR, year)
                        calendar.set(Calendar.MONTH, month)
                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                        tvDate.text = SimpleDateFormat("EE, dd MMMM").format(calendar.time)
                    }
                DatePickerDialog(
                    this@MainActivity,
                    dateSetListener,
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

            btnStart.setOnClickListener {
                setAlarm()
                ivAlarmFlag.setImageResource(R.drawable.ic_baseline_alarm_on_24)
            }

            btnStop.setOnClickListener {
                cancelAlarm()
                ivAlarmFlag.setImageResource(R.drawable.ic_baseline_alarm_off_24)
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        notificationProvider = null
    }

    private fun setAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReciever::class.java)
        pending = PendingIntent.getBroadcast(this, 0, intent, 0)
        alarmManager.set(
            AlarmManager.RTC_WAKEUP,
            calendar.timeInMillis,
            pending
        )
        Toast.makeText(this, "Alarm set", Toast.LENGTH_SHORT).show()
    }

    private fun cancelAlarm() {
        alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        val intent = Intent(this, AlarmReciever::class.java)
        pending = PendingIntent.getBroadcast(this, 0, intent, 0)
        alarmManager.cancel(pending)
        Toast.makeText(this, "Alarm canceled", Toast.LENGTH_SHORT).show()
    }

}