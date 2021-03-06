package com.mahdikh.vision.arrowpanel.animator

import android.view.View

class RotateInLeftAnimator : RotationAnimator() {
    override fun preAnimateShow(v: View) {
        super.preAnimateShow(v)
        v.apply {
            val w = measuredWidth

            pivotX = w - w / 4F
            pivotY = measuredHeight / 4F

            translationX = v.x + 100
        }
    }

    override fun animateShowImpl(v: View) {
        super.animateShowImpl(v)
        v.animate().apply {
            translationX(v.translationX - 100)
            interpolator = this@RotateInLeftAnimator.interpolator
            duration = this@RotateInLeftAnimator.duration
        }.start()
    }
}