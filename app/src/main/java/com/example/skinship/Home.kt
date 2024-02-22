package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {

    private lateinit var button9: Button
    private lateinit var button10: Button
    private lateinit var button11: Button
    private lateinit var button12: Button
    private lateinit var button28: Button
    private lateinit var button29: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize views using findViewById
        button9 = findViewById(R.id.button9)
        button10 = findViewById(R.id.button10)
        button11 = findViewById(R.id.button11)
        button12 = findViewById(R.id.button12)
        button28 = findViewById(R.id.button28)
        button29 = findViewById(R.id.button29)

        button9.setOnClickListener {
            // Start HomeActivity
            startActivity(Intent(this, Home::class.java))
        }

        button10.setOnClickListener {
            // Start ProductListActivity
            startActivity(Intent(this, ProductList::class.java))
        }

        button11.setOnClickListener {
            // Start RecommendationActivity
            startActivity(Intent(this, Recommendation::class.java))
        }

        button12.setOnClickListener {
            // Start AboutUsActivity
            startActivity(Intent(this, AboutUs::class.java))
        }

        button28.setOnClickListener {
            // Start UserProfileActivity
            startActivity(Intent(this, UserProfile::class.java))
        }

        button29.setOnClickListener {
            // Start LoginActivity or any other appropriate activity for logout
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}