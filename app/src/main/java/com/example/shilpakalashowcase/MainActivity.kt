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
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        btnHeritage.setOnClickListener {
            val intent = Intent(this, HeritageActivity::class.java)
            startActivity(intent)
        }

        btnTimeline.setOnClickListener {
            val intent = Intent(this, TimelineActivity::class.java)
            startActivity(intent)
        }
    }
}