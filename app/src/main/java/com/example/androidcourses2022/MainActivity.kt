package com.example.androidcourses2022

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcourses2022.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private val kpfu_url: String = "https://kpfu.ru"
    private val kpfu_tel: String = "88007009275"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        binding?.run {
            btnCall.setOnClickListener {
                call()
            }
            btnSearch.setOnClickListener {
                search()
            }
            btnSend.setOnClickListener {
                send()
            }
        }
    }

    private fun call() {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + kpfu_tel))
        startActivity(intent)
    }

    private fun search() {
        val intent = Intent()
        intent.setAction(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, kpfu_url)
        startActivity(intent)
    }

    private fun send() {
        val intent = Intent()
        intent.setAction(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT, "Сайт кфу: ${kpfu_url} \n" +
                "Телефон приемной комиссии: $kpfu_tel")
        intent.setType("text/plan")

        val chooserIntent = Intent.createChooser(
            intent,
            "Share"
        )
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(chooserIntent)
        }


    }
}