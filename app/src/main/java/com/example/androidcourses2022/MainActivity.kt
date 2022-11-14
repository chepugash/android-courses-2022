package com.example.androidcourses2022

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.example.androidcourses2022.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.util.*


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    private val getPicture = registerForActivityResult(TakePicContract()) { bitmapPic: Bitmap? ->
        binding?.ivContent?.setImageBitmap(bitmapPic)
    }

    private val mPermissions =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) {
            if (it.values.all { true })  getPicture.launch(null)
            else if (it[android.Manifest.permission.CAMERA] != true &&
                    it[android.Manifest.permission.READ_EXTERNAL_STORAGE] == true) {
                getPicture.launch(null)
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        binding?.run {
            btnAdd.setOnClickListener {
                mPermissions.launch(arrayOf(
                        android.Manifest.permission.CAMERA,
                        android.Manifest.permission.READ_EXTERNAL_STORAGE
                    ))
            }
        }
    }

}