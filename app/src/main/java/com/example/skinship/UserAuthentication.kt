package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UserAuthentication : AppCompatActivity() {

    // Define your views
    private lateinit var emailEditText: EditText
    private lateinit var codeEditText: EditText
    private lateinit var sendCodeButton: Button
    private lateinit var resendCodeButton: Button
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_authentication)

        // Initialize views
        emailEditText = findViewById(R.id.editTextTextEmailAddress3)
        codeEditText = findViewById(R.id.editTextNumberPassword)
        sendCodeButton = findViewById(R.id.button6)
        resendCodeButton = findViewById(R.id.button7)
        loginButton = findViewById(R.id.button8)

        // Set click listeners
        sendCodeButton.setOnClickListener {
            // Logic to send code to the provided email
            val email = emailEditText.text.toString()
            // Implement your logic here
            Toast.makeText(this, "Code sent to $email", Toast.LENGTH_SHORT).show()
        }

        resendCodeButton.setOnClickListener {
            // Logic to resend the code to the provided email
            val email = emailEditText.text.toString()
            // Implement your logic here
            Toast.makeText(this, "Code resent to $email", Toast.LENGTH_SHORT).show()
        }

        loginButton.setOnClickListener {
            // Logic to authenticate user using the provided code
            val code = codeEditText.text.toString()
            // Implement your authentication logic here
            if (isValidCode(code)) {
                // Authentication successful
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                // Navigate to the next activity or perform any desired action
                startActivity(Intent(this, Home::class.java))
            } else {
                // Authentication failed
                Toast.makeText(this, "Invalid code, please try again", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Dummy validation function (replace with your authentication logic)
    private fun isValidCode(code: String): Boolean {
        // Implement your validation logic here
        return code.isNotEmpty()
    }
}