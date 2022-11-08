package com.example.androidcourses2022

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcourses2022.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var notificationProvider: NotificationProvider? = null

    private val time = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        binding?.run {
            tvTime.text = SimpleDateFormat("HH:mm").format(time.time)
            tvDate.text = SimpleDateFormat("EE, dd MMMM").format(time.time)
            tvTime.setOnClickListener {
                val timeSetListener = TimePickerDialog
                    .OnTimeSetListener { timePicker, hour, minute ->
                        time.set(Calendar.HOUR_OF_DAY, hour)
                        time.set(Calendar.MINUTE, minute)
                        tvTime.text = SimpleDateFormat("HH:mm").format(time.time)
                    }
                TimePickerDialog(
                    this@MainActivity,
                    timeSetListener,
                    time.get(Calendar.HOUR_OF_DAY),
                    time.get(Calendar.MINUTE),
                    true
                ).show()
            }

            tvDate.setOnClickListener {
                val dateSetListener = DatePickerDialog
                    .OnDateSetListener { datePicker, year, month, dayOfMonth ->
                        time.set(Calendar.YEAR, year)
                        time.set(Calendar.MONTH, month)
                        time.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                        tvDate.text = SimpleDateFormat("EE, dd MMMM").format(time.time)
                    }
                DatePickerDialog(
                    this@MainActivity,
                    dateSetListener,
                    time.get(Calendar.YEAR),
                    time.get(Calendar.MONTH),
                    time.get(Calendar.DAY_OF_MONTH)
                ).show()
            }

            btnStart.setOnClickListener {
                notificationProvider = NotificationProvider(this@MainActivity)
                notificationProvider?.showNotification(
                    title = "Проснись",
                    text = "Тебе к первой паре..."
                )

            }

            btnStop.setOnClickListener {
                TODO()
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        notificationProvider = null
    }

}