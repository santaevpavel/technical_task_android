package ru.santaev.techtask.utils

import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.transition.TransitionManager

@BindingAdapter("bindGoneUnless")
fun bindGoneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
    TransitionManager.beginDelayedTransition(view.parent as ViewGroup)
}

@BindingAdapter("bindInvisibleUnless")
fun bindInvisibleUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.INVISIBLE
    TransitionManager.beginDelayedTransition(view.parent as ViewGroup)
}

