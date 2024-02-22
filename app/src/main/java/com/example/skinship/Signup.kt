package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {

    // Define your views
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Initialize views
        emailEditText = findViewById(R.id.editTextTextEmailAddress2)
        passwordEditText = findViewById(R.id.editTextTextPassword2)
        signUpButton = findViewById(R.id.button4)
        loginButton = findViewById(R.id.button3)

        // Set click listeners
        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val editText = findViewById<EditText>(R.id.editTextText)
            val userInput = editText.text.toString()

            val intent = Intent(this, UserProfile::class.java).apply {
                putExtra("USER_NAME", userInput)
            }
            startActivity(intent)

            // Perform sign up (register user) logic
            if (signUpUser(name, email, password)) {
                // Sign up successful
                Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show()
                // You can navigate to the next activity or perform any desired action here
                startActivity(Intent(this, Home::class.java))
            } else {
                // Sign up failed
                Toast.makeText(this, "Sign up failed. Please try again.", Toast.LENGTH_SHORT).show()
            }
        }

        loginButton.setOnClickListener {
            // Navigate to the home activity
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    // Dummy sign up (register user) function (replace with your sign up logic)
    private fun signUpUser(name: String, email: String, password: String): Boolean {
        // Here you would typically perform registration with a backend or database
        // For demonstration purposes, this is just a dummy implementation
        return name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()
    }
}