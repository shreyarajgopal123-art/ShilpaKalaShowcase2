package com.example.shilpakalashowcase

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnWhatsapp = findViewById<Button>(R.id.btnWhatsapp)

        btnWhatsapp.setOnClickListener {

            val message =
                "Hello, I am interested in the Ganesha Sculpture. Product ID: GS101"

            val url =
                "https://wa.me/911234567890?text=" + Uri.encode(message)

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)

            startActivity(intent)
        }
    }
}