package com.example.spicyanimatiron

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.spicyanimation.SpicyAnimation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize the blinked button
        val blinkOneButton = findViewById<Button>(R.id.blink_one_button)
        val blinkManyButton = findViewById<Button>(R.id.blink_many_button)
        val infiniteButton = findViewById<Button>(R.id.infinite_button)

        // initialize the faded button
        val fadeUpButton = findViewById<Button>(R.id.fade_up_button)
        val fadeDownButton = findViewById<Button>(R.id.fade_down_button)
        val fadeLeftButton = findViewById<Button>(R.id.fade_left_button)
        val fadeRightButton = findViewById<Button>(R.id.fade_right_button)

        // initialize the rotated button
        val rectangularRotationOne = findViewById<Button>(R.id.rectangular_rotation_one)
        val rectangularRotationTwo = findViewById<Button>(R.id.rectangular_rotation_two)

        // initialize the labels
        val blinkTitle = findViewById<TextView>(R.id.blinkTitle_tv)
        val fadeTitle = findViewById<TextView>(R.id.fadeTitle_tv)
        val rotationTitle = findViewById<TextView>(R.id.rotationTitle_tv)

        // top text view
        val topTextView = findViewById<TextView>(R.id.topTextView)

        /**
         * click to start the blink animation on all the buttons
         */
        blinkTitle.setOnClickListener {
            SpicyAnimation().blinkView(
                blinkOneButton,
                800,
                Color.parseColor("#c85a54"),
                Color.parseColor("#ff8a80")
            )
            SpicyAnimation().blinkView(
                blinkManyButton,
                1000,
                Color.parseColor("#c85a54"),
                Color.parseColor("#ff8a80"),
                3
            )
            SpicyAnimation().blinkViewInfinite(
                infiniteButton,
                1000,
                Color.parseColor("#c85a54"),
                Color.parseColor("#ff8a80")
            )
        }

        /**
         * click to start the fade of all buttons
         */
        fadeTitle.setOnClickListener {
            SpicyAnimation().fadeToUp(fadeUpButton, 50F, 1000)
            SpicyAnimation().fadeToDown(fadeDownButton, 50F, 2000)
            SpicyAnimation().fadeToLeft(fadeLeftButton, 50F, 1000)
            SpicyAnimation().fadeToRight(fadeRightButton, 50F, 3000)
        }

        /**
         * click to start the rotation
         */
        rotationTitle.setOnClickListener {
            SpicyAnimation().rectangularRoad(rectangularRotationOne, 100F, 500, false)
            SpicyAnimation().rectangularRoad(rectangularRotationTwo, 50F, 1000, true)
        }

        /**
         * click only on one button
         */
        blinkOneButton.setOnClickListener {
            SpicyAnimation().blinkView(
                blinkOneButton,
                2000,
                Color.parseColor("#c95B64"),
                Color.parseColor("#ff8a80")
            )
        }

        SpicyAnimation().fadeToDown(topTextView, 50F, 1500)
    }
}
