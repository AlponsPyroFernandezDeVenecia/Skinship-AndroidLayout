package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class UserProfile : AppCompatActivity() {
    private lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        // Initialize views
        val homeButton: Button = findViewById(R.id.button30)
        val productsButton: Button = findViewById(R.id.button31)
        val aboutUsButton: Button = findViewById(R.id.button32)
        val recommendationButton: Button = findViewById(R.id.button33)


        val textView = findViewById<TextView>(R.id.textView12)
        val userName = intent.getStringExtra("USER_NAME")
        textView.text = userName

        // Set onClickListeners for buttons
        homeButton.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        productsButton.setOnClickListener {
            startActivity(Intent(this, ProductList::class.java))
        }

        aboutUsButton.setOnClickListener {
            startActivity(Intent(this, AboutUs::class.java))
        }

        recommendationButton.setOnClickListener {
            startActivity(Intent(this, Recommendation::class.java))
        }
    }
}