package com.example.androidcourses2022

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.androidcourses2022.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private val getPicture = registerForActivityResult(TakePicContract()) { bitmapPic: Bitmap? ->
        binding?.ivContent?.setImageBitmap(bitmapPic)
    }

    private val mPermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        binding?.run {
            btnAdd.setOnClickListener {
                getPicture.launch(null)
            }
        }
    }

}