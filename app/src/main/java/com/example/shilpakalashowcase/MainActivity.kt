package com.example.shilpakalashowcase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGallery = findViewById<Button>(R.id.btnGallery)
        val btnHeritage = findViewById<Button>(R.id.btnHeritage)
        val btnTimeline = findViewById<Button>(R.id.btnTimeline)

        btnGallery.setOnClickListener {
            startActivity(Intent(this, GalleryActivity::class.java))
        }

        btnHeritage.setOnClickListener {
            startActivity(Intent(this, HeritageActivity::class.java))
        }

        btnTimeline.setOnClickListener {
            startActivity(Intent(this, TimelineActivity::class.java))
        }
    }
}