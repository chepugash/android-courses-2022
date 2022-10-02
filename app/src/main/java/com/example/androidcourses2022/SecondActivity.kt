package com.example.androidcourses2022

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcourses2022.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    private var binding: ActivitySecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        val intent = intent
        val uri = intent.getParcelableExtra<Parcelable>(Intent.EXTRA_STREAM) as Uri?

        binding?.ivShared?.setImageURI(uri)
    }
}