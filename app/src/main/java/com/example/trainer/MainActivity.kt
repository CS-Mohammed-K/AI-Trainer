package com.example.trainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val splash  = findViewById<ImageView>(R.id.splash)
        splash.alpha=0f
        splash.animate().setDuration(1500).alpha(1f).withEndAction(){
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
            startActivity(Intent(this@MainActivity, LivePreviewActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }
}