package com.example.spicyanimation

import android.view.View

/**
 * to parse your color you can use getResources().getColor(R.color.YOUR_COLOR) in case
 * you declare your color in res/values/colors
 * or Color.parseColor("#FFF") to parse your Hex colors
 * this functions return Int to be used
 */

class SpicyAnimation {

    /**
     * by default the animation will be repeated one time
     */
    fun blinkView(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int) {
        Blink.blinkView(view, appearanceTime, firstColor, secondColor)
    }

    /**
     * when the user add the arg of how many times the animation will be repeated
     */
    fun blinkView(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int, toBeRepeated: Int) {
        Blink.blinkView(view, appearanceTime, firstColor, secondColor, toBeRepeated)
    }

    fun blinkViewInfinite(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int) {
        Blink.blinkViewInfinite(view, appearanceTime, firstColor, secondColor)
    }

    /**
     * funtions to make a fade animation with each direction
     * space wich is a Float represent pixels
     * duration wich is a Long that represent time of each animation
     */
    fun fadeToUp(view: View, spaceWithPixel: Float, duration: Long) {
        SimpleFade.fadeToUp(view, spaceWithPixel, duration)
    }

    fun fadeToDown(view: View, spaceWithPixel: Float, duration: Long) {
        SimpleFade.fadeToDown(view, spaceWithPixel, duration)
    }

    fun fadeToLeft(view: View, spaceWithPixel: Float, duration: Long) {
        SimpleFade.fadeToLeft(view, spaceWithPixel, duration)
    }

    fun fadeToRight(view: View, spaceWithPixel: Float, duration: Long) {
        SimpleFade.fadeToRight(view, spaceWithPixel, duration)
    }

    /**
     * funtion to make rectangular rotation
     * space wich is a Float represent pixels
     * duration wich is a Long that represent time of each animation
     */
    fun rectangularRoad(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        RectangularRoad.start(view, spaceWithPixel, duration, isFade)
    }
}
