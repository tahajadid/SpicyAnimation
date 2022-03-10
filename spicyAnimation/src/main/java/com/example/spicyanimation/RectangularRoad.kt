package com.example.spicyanimation

import android.view.View

object RectangularRoad {

    fun start(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        // Set button alpha to the 0
        if (isFade) view.alpha = 0F

        // Animate the alpha value to 1F and set duration
        view.animate().alpha(1F).translationXBy(spaceWithPixel).setDuration(duration).withEndAction {
            second(view, spaceWithPixel, duration, isFade)
        }
    }

    fun second(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        view.animate().alpha(1F).translationYBy(spaceWithPixel).setDuration(duration).withEndAction {
            third(view, spaceWithPixel, duration, isFade)
        }
    }

    fun third(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        view.animate().alpha(1F).translationXBy(-2 * spaceWithPixel).setDuration(duration).withEndAction {
            fourth(view, spaceWithPixel, duration, isFade)
        }
    }

    // init to the init position
    fun fourth(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        view.animate().alpha(1F).translationYBy(-spaceWithPixel).setDuration(duration).withEndAction {
            last(view, spaceWithPixel, duration, isFade)
        }
    }

    fun last(view: View, spaceWithPixel: Float, duration: Long, isFade: Boolean) {
        if (isFade) {
            view.animate().alpha(0F).translationXBy(spaceWithPixel).setDuration(duration).withEndAction {
                view.animate().alpha(1F)
            }
        } else view.animate().alpha(1F).translationXBy(spaceWithPixel).setDuration(duration)
    }
}
