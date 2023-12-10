package com.example.backgroundchangingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHot = findViewById<Button>(R.id.btnHot)
        val buttonCool = findViewById<Button>(R.id.btnCool)
        val layoutL = findViewById<LinearLayout>(R.id.Linearlayout)

        buttonHot.setOnClickListener {
            //want to change the background color of the app to black

            layoutL.setBackgroundColor(R.color.black)

        }
        buttonCool.setOnClickListener {
            //want to change the app background color to blue
            layoutL.setBackgroundColor(com.google.android.material.R.color.material_blue_grey_800)
        }
    }
}