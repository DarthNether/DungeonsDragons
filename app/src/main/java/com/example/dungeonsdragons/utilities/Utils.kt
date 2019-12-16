package com.example.dungeonsdragons.utilities

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.google.android.material.textfield.TextInputEditText

val TextInputEditText.intVal
    get() = text.toString().toInt()

fun <T> Fragment.observeFromView(data: LiveData<T>, block: (T) -> Unit) {
    data.observe(viewLifecycleOwner, Observer {
        it?.let(block)
    })
}