package com.example.skinship

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProductList : AppCompatActivity() {
    private lateinit var homeButton: Button
    private lateinit var productsButton: Button
    private lateinit var aboutUsButton: Button
    private lateinit var recommendationButton: Button

    private lateinit var quantityTextView: TextView
    private lateinit var discardButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        homeButton = findViewById(R.id.button15)
        productsButton = findViewById(R.id.button16)
        aboutUsButton = findViewById(R.id.button17)
        recommendationButton = findViewById(R.id.button18)

        quantityTextView = findViewById(R.id.textView42)
        discardButton = findViewById(R.id.button44)

        setButtonListeners()

        // Set onClickListeners for buttons 19, 20, 21, 22, 23, 24, 25, 26, 27
        val buttons = listOf<Button>(
            findViewById(R.id.button19),
            findViewById(R.id.button20),
            findViewById(R.id.button21),
            findViewById(R.id.button22),
            findViewById(R.id.button23),
            findViewById(R.id.button24),
            findViewById(R.id.button25),
            findViewById(R.id.button26),
            findViewById(R.id.button27)
        )

        for (button in buttons) {
            button.tag = 100 // Set the tag of each button to 100
            button.setOnClickListener {
                increaseQuantity()
            }
        }

        // Set onClickListener for discardButton
        discardButton.setOnClickListener {
            decreaseQuantity()
        }
    }

    private fun setButtonListeners() {
        homeButton.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

        productsButton.setOnClickListener {
            // Transfer the quantity value to checkout activity
            val quantity = quantityTextView.text.toString()
            val intent = Intent(this, checkout::class.java).apply {
                putExtra("QUANTITY_ORDER", quantity)
            }
            startActivity(intent)
        }

        aboutUsButton.setOnClickListener {
            startActivity(Intent(this, AboutUs::class.java))
        }

        recommendationButton.setOnClickListener {
            startActivity(Intent(this, Recommendation::class.java))
        }
    }

    private fun increaseQuantity() {
        var quantity = quantityTextView.text.toString().toInt()
        quantity++
        quantityTextView.text = quantity.toString()
    }

    private fun decreaseQuantity() {
        var quantity = quantityTextView.text.toString().toInt()
        if (quantity > 0) {
            quantity--
            quantityTextView.text = quantity.toString()
        }
    }
}

