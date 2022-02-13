package com.c.staticbroadcastreceiver

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.image_view)

        val intent:Intent=intent
        val action=intent.action
        val type=intent.type

        if(Intent.ACTION_SEND == action && type!=null){
            imageView.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM))
        }
    }
}