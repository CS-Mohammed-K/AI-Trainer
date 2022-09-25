package com.example.trainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)


        // listen to the Sign up text if clicked, then redirect to Signup activity
        val signup = findViewById<TextView>(R.id.LinLayoutText2)
        signup.setOnClickListener {
            val myIntent = Intent(this, sign_up::class.java)
            startActivity(myIntent)
        }
        val signin = findViewById<TextView>(R.id.btn_signin)
        signin.setOnClickListener {
            val myIntent = Intent(this, LivePreviewActivity::class.java)
            startActivity(myIntent)
        }
    }
}