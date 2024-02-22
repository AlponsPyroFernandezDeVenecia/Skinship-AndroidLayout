package com.example.skinship

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class checkout : AppCompatActivity() {

    // Declare variables for views
    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneNumberEditText: EditText
    private lateinit var cardNumberEditText: EditText
    private lateinit var cardExpirationEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        // Initialize views
        firstNameEditText = findViewById(R.id.editTextText2)
        lastNameEditText = findViewById(R.id.editTextText3)
        emailEditText = findViewById(R.id.editTextTextEmailAddress4)
        phoneNumberEditText = findViewById(R.id.editTextPhone)
        cardNumberEditText = findViewById(R.id.editTextNumber)
        cardExpirationEditText = findViewById(R.id.editTextDate)

        // Set onClickListener for the button
        val homeButton: Button = findViewById(R.id.button42)
        homeButton.setOnClickListener {
            // Handle button click action here
            // For example, you can retrieve data from EditText fields
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val phoneNumber = phoneNumberEditText.text.toString()
            val cardNumber = cardNumberEditText.text.toString()
            val cardExpiration = cardExpirationEditText.text.toString()

            // Now you can do whatever you want with this data, such as saving it to a database

            // Retrieve the value from the previous activity's TextView
            val yourOrderTextView: TextView = findViewById(R.id.textView41)
            val yourOrderText = intent.getStringExtra("YOUR_ORDER_TEXT")
            yourOrderTextView.text = yourOrderText
        }
    }
}