package com.example.counterforpresentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count = 0
    private val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun onPress(view: View){
        val textview1 = findViewById<TextView>(R.id.textView)
        val textview2 = findViewById<TextView>(R.id.textView2)
        count ++
        val timePassed = (System.currentTimeMillis() - startTime)/1000
        val clicksPerSec = count/timePassed
        textview1.text = "$count Clicks"
        textview2.text = "$clicksPerSec Clicks per Second"
    }
}