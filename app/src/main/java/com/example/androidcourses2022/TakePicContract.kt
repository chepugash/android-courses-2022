package com.example.androidcourses2022

import android.app.Activity
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.result.contract.ActivityResultContract
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.checkSelfPermission
import java.util.jar.Manifest

class TakePicContract : ActivityResultContract<Unit?, Bitmap?>() {

    private var context: Context? = null

    override fun createIntent(context: Context, input: Unit?): Intent {
        this.context = context
        return openPictureIntent(context)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): Bitmap? {
//        return intent.takeIf { resultCode == Activity.RESULT_OK }?.getParcelableExtra("data")
        if (resultCode == Activity.RESULT_OK) {
            if (intent?.data is Uri) {
                return MediaStore.Images.Media.getBitmap(context?.contentResolver, intent.data)
            } else {
                return intent?.getParcelableExtra("data")
            }
        } else return null
    }

    override fun getSynchronousResult(
        context: Context,
        input: Unit?
    ): SynchronousResult<Bitmap?>? = null

    private fun openPictureIntent(context: Context): Intent {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE).takeIf {
            it.resolveActivity(context.packageManager) != null
        }
        val galleryIntent = Intent(Intent.ACTION_PICK).apply {
            type = "image/*"
        }

        val chooserIntent = Intent.createChooser(galleryIntent, "")
        chooserIntent?.putExtra(Intent.EXTRA_INITIAL_INTENTS, arrayOf(cameraIntent))
        return chooserIntent
    }

}