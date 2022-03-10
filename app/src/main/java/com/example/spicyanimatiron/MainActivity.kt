package com.example.spicyanimatiron

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.spicyanimation.SpicyAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blinkButton = findViewById<Button>(R.id.blink_button)
        val infiniteButton = findViewById<Button>(R.id.infinite_button)

        blinkButton.setOnClickListener {
            SpicyAnimation().blinkView(
                blinkButton,
                800,
                Color.parseColor("#0F43F4"),
                Color.parseColor("#A0A34F")
            )
        }

        infiniteButton.setOnClickListener {
            SpicyAnimation().blinkView(
                infiniteButton,
                1000,
                Color.parseColor("#80A314"),
                Color.parseColor("#A0F348"),
                3
            )
        }
    }
}
