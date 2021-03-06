package com.mahdikh.vision.arrowpanel.widget

import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment

abstract class PanelFragment : Fragment() {
    lateinit var panel: Panel
    internal var onResumeListener: OnResumeListener? = null

    override fun onResume() {
        super.onResume()
        onResumeListener?.onResume()
    }

    open fun dismiss() {
        panel.dismiss()
    }

    open fun cancel() {
        panel.cancel()
    }

    open fun dismiss(endAction: Runnable) {
        panel.dismiss(endAction)
    }

    open fun cancel(endAction: Runnable) {
        panel.cancel(endAction)
    }

    open fun runOnDismissed(runnable: Runnable) {
        panel.runOnDismissed(runnable)
    }

    open fun setCancelable(cancelable: Boolean) {
        panel.cancelable = cancelable
    }

    open fun setCancelableOnTouchOutside(cancelable: Boolean) {
        panel.cancelableOnTouchOutside = cancelable
    }

    open fun setInteractionTouchOutside(interaction: Boolean) {
        panel.interactionTouchOutside = interaction
    }

    open fun setDim(@ColorInt dimColor: Int, @Panel.DimDef dimAmount: Float = 0.6F) {
        panel.setDim(dimColor, dimAmount)
    }

    open fun isShowingPanel(): Boolean {
        return panel.isShowing()
    }

    fun interface OnResumeListener {
        fun onResume()
    }
}