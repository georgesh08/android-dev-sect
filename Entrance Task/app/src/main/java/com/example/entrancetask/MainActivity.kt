package com.example.entrancetask

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.textfield.TextInputEditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val input = findViewById<TextInputEditText>(R.id.inputText)

        val buttonPrint: Button = findViewById(R.id.buttonPrint)
        buttonPrint.setOnClickListener {
            Toast.makeText(applicationContext, input.text.toString(), Toast.LENGTH_SHORT).show()
        }
        val buttonChangeColor: Button = findViewById(R.id.buttonChange)
        buttonChangeColor.setOnClickListener {
            val background = findViewById<ConstraintLayout>(R.id.constraintLayout)
            val color =
                Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            background.setBackgroundColor(color)
        }
    }
}