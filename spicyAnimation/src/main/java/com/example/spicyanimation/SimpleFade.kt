package com.example.spicyanimation

import android.view.View

object SimpleFade {

    fun fadeToUp(view: View, spaceWithPixel: Float, duration: Long) {

        // Set button alpha to the 0
        view.alpha = 0F
        view.translationY = spaceWithPixel

        // Animate the alpha value to 1F and set duration
        view.animate().alpha(1F).translationYBy(-spaceWithPixel).setDuration(duration)
    }

    fun fadeToDown(view: View, spaceWithPixel: Float, duration: Long) {

        // Set button alpha to the 0
        view.alpha = 0F
        view.translationY = -spaceWithPixel

        // Animate the alpha value to 1F and set duration
        view.animate().alpha(1F).translationYBy(spaceWithPixel).setDuration(duration)
    }

    fun fadeToLeft(view: View, spaceWithPixel: Float, duration: Long) {

        // Set button alpha to the 0
        view.alpha = 0F
        view.translationX = spaceWithPixel

        // Animate the alpha value to 1F and set duration
        view.animate().alpha(1F).translationXBy(-spaceWithPixel).setDuration(duration)
    }

    fun fadeToRight(view: View, spaceWithPixel: Float, duration: Long) {

        // Set button alpha to the 0
        view.alpha = 0F
        view.translationX = -spaceWithPixel

        // Animate the alpha value to 1F and set duration
        view.animate().alpha(1F).translationXBy(spaceWithPixel).setDuration(duration)
    }
}
