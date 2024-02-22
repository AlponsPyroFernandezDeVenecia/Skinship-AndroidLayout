package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Recommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        val homeButton: Button = findViewById(R.id.button38)
        val productsButton: Button = findViewById(R.id.button39)
        val aboutUsButton: Button = findViewById(R.id.button40)
        val recommendationButton: Button = findViewById(R.id.button41)

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
            // Do nothing since we are already in the Recommendation activity
        }
    }
}