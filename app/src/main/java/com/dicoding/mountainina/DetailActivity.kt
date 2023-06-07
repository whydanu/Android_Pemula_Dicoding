package com.dicoding.mountainina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target;


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOUNTAIN = "extra_mountain"
        const val EXTRA_MOUNTAIN_NAME = "extra_mountain_name"
        const val EXTRA_MOUNTAIN_DETAIL = "extra_mountain_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detail_name = findViewById<TextView>(R.id.detail_mountain_name)
        val detail_detail = findViewById<TextView>(R.id.detail_mountain_detail)
        val detail_image = findViewById<ImageView>(R.id.detail_mountain_image)

        val nama = intent.getStringExtra(EXTRA_MOUNTAIN_NAME)
        val detail = intent.getStringExtra(EXTRA_MOUNTAIN_DETAIL)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_MOUNTAIN, 0))
            .apply(RequestOptions().format(DecodeFormat.PREFER_ARGB_8888)
                .override(Target.SIZE_ORIGINAL))
            .into(detail_image)

        detail_name.text = nama.toString()
        detail_detail.text = detail.toString()

        val actionbar = supportActionBar
        actionbar!!.title = "Mountain Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val ButtonFav = findViewById<Button>(R.id.btn_fav)
        val ButtonShare = findViewById<Button>(R.id.btn_share)

        ButtonFav.setOnClickListener() {
            Toast.makeText(this, "Set to Favorite ", Toast.LENGTH_SHORT).show()
        }


        ButtonShare.setOnClickListener() {
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            val link = "https://www.traveloka.com/id-id/explore/destination/gunung-tertinggi-di-indonesia-acc/29747"
            share.putExtra(Intent.EXTRA_SUBJECT, "More Info ")
            share.putExtra(Intent.EXTRA_TEXT, link)
            startActivity(Intent.createChooser(share, "share text via"))
        }

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}