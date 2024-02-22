package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Define your views
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var signUpButton: Button
    private lateinit var forgotPasswordButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        passwordEditText = findViewById(R.id.editTextTextPassword)
        loginButton = findViewById(R.id.button)
        signUpButton = findViewById(R.id.button2)
        forgotPasswordButton = findViewById(R.id.button5)

        // Set click listeners
        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Perform authentication (e.g., check email and password)
            if (authenticateUser(email, password)) {
                // Authentication successful
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Navigate to next activity or perform desired action
                startActivity(Intent(this, Home::class.java))
            } else {
                // Authentication failed
                Toast.makeText(this, "Login failed. Invalid email or password.", Toast.LENGTH_SHORT).show()
            }
        }

        signUpButton.setOnClickListener {
            // Implement sign up logic or navigate to sign up activity
            Toast.makeText(this, "Sign up button clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Signup::class.java))
        }

        forgotPasswordButton.setOnClickListener {
            // Implement forgot password logic or navigate to forgot password activity
            Toast.makeText(this, "Forgot password button clicked", Toast.LENGTH_SHORT).show()
        }
    }

    // Dummy authentication function (replace with your authentication logic)
    private fun authenticateUser(email: String, password: String): Boolean {
        // Dummy email and password for demonstration
        val dummyEmail = "user@example.com"
        val dummyPassword = "password123"

        // Check if email and password match the dummy credentials
        return email == dummyEmail && password == dummyPassword
    }
}