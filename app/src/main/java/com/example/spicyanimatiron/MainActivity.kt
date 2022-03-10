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

        val blinkOneButton = findViewById<Button>(R.id.blink_one_button)
        val blinkManyButton = findViewById<Button>(R.id.blink_many_button)
        val infiniteButton = findViewById<Button>(R.id.infinite_button)
        val rectangularRoad = findViewById<Button>(R.id.rectangular_road)

        blinkOneButton.setOnClickListener {
            SpicyAnimation().blinkView(
                blinkOneButton,
                800,
                Color.parseColor("#0F43F4"),
                Color.parseColor("#A0A34F")
            )
        }

        blinkManyButton.setOnClickListener {
            SpicyAnimation().blinkView(
                blinkManyButton,
                1000,
                Color.parseColor("#80A314"),
                Color.parseColor("#A0F348"),
                3
            )
        }

        infiniteButton.setOnClickListener {
            SpicyAnimation().blinkViewInfinite(
                infiniteButton,
                1000,
                Color.parseColor("#80A314"),
                Color.parseColor("#A0F348")
            )
        }

        SpicyAnimation().fadeToRight(rectangularRoad, 1500)
    }
}
