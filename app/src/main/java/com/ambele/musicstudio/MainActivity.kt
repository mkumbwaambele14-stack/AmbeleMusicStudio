package com.ambele.musicstudio

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this)
        title.text = "Ambele Music Studio 🎵"
        title.textSize = 28f
        title.setTextColor(Color.WHITE)
        title.setBackgroundColor(Color.BLACK)
        title.gravity = 17

        setContentView(title)
    }
}
