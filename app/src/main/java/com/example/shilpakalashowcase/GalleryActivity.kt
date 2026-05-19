package com.example.shilpakalashowcase

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val img1 = findViewById<ImageView>(R.id.img1)

        img1.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}