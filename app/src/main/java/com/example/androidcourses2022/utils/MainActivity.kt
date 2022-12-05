package com.example.androidcourses2022.utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcourses2022.R
import com.example.androidcourses2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        binding?.run {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SongListFragment())
                .commit()
        }
    }
}