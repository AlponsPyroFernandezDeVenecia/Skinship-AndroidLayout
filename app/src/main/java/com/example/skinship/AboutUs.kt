package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val homeButton: Button = findViewById(R.id.button34)
        val productsButton: Button = findViewById(R.id.button35)
        val aboutUsButton: Button = findViewById(R.id.button36)
        val recommendationButton: Button = findViewById(R.id.button37)

        // Set onClickListeners for buttons
        homeButton.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        productsButton.setOnClickListener {
            startActivity(Intent(this, ProductList::class.java))
        }

        aboutUsButton.setOnClickListener {
            // Do nothing since we are already in the AboutUs activity
        }

        recommendationButton.setOnClickListener {
            startActivity(Intent(this, Recommendation::class.java))
        }
    }
}