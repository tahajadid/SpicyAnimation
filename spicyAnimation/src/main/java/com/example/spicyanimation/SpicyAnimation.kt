package com.example.spicyanimation

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation

class SpicyAnimation {

    /**
     * to parse your color you can use getResources().getColor(R.color.YOUR_COLOR) in case
     * you declare your color in res/values/colors
     * or Color.parseColor("#FFF") to parse your Hex colors
     * this functions return Int to be used
     */

    /**
     * by default the animation will be repeated one time
     */
    fun blinkView(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int) {

        // adding the background color
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor", firstColor, secondColor
        )

        // set the duration for each color time with Ms
        animator.duration = appearanceTime

        /**
         * evaluator can be used to perform type interpolation between integer values that
         * represent ARGB colors.
         */
        animator.setEvaluator(ArgbEvaluator())

        // color will be shown in absolute (one time)
        animator.repeatCount = Animation.ABSOLUTE

        // start the animation
        animator.start()
    }

    /**
     * when the user add the arg of how many times the animation will be repeated
     */
    fun blinkView(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int, toBeRepeated: Int) {

        // adding the background color
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor", firstColor, secondColor
        )

        // set the duration for each color time with Ms
        animator.duration = appearanceTime

        animator.setEvaluator(ArgbEvaluator())

        // how many times the animation will be repeated
        animator.repeatCount = toBeRepeated

        // start the animation
        animator.start()
    }

    fun blinkViewInfinite(view: View, appearanceTime: Long, firstColor: Int, secondColor: Int) {

        // adding the background color
        val animator: ObjectAnimator = ObjectAnimator.ofInt(
            view, "backgroundColor", firstColor, secondColor
        )

        // set the duration for each color time with Ms
        animator.duration = appearanceTime

        animator.setEvaluator(ArgbEvaluator())

        // color will be shown in Infinite Mode
        animator.repeatCount = Animation.INFINITE

        // start the animation
        animator.start()
    }
}
