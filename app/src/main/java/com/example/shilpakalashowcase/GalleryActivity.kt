package com.example.shilpakalashowcase

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.GridView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {

    private val images = intArrayOf(
        R.drawable.sculpture1,
        R.drawable.sculpture2,
        R.drawable.sculpture3,
        R.drawable.sculpture4,
        R.drawable.sculpture5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val gridView = findViewById<GridView>(R.id.gridView)
        val btnOpenDetail = findViewById<Button>(R.id.btnOpenDetail)

        gridView.adapter = object : BaseAdapter() {
            override fun getCount(): Int = images.size
            override fun getItem(position: Int): Any = images[position]
            override fun getItemId(position: Int): Long = position.toLong()

            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                val imageView = ImageView(this@GalleryActivity)
                imageView.setImageResource(images[position])
                imageView.layoutParams = ViewGroup.LayoutParams(500, 500)
                imageView.scaleType = ImageView.ScaleType.CENTER_CROP
                imageView.setPadding(8, 8, 8, 8)
                return imageView
            }
        }

        btnOpenDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("image", images[0])
            startActivity(intent)
        }
    }
}
