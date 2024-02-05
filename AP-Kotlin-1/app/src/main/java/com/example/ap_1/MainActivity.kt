package com.example.ap_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingText = findViewById<TextView>(R.id.tvHello)
        val editTextValue = findViewById<EditText>(R.id.tvInput)
        val inputButton = findViewById<Button>(R.id.tvButton)
        inputButton.setOnClickListener(){
           val gotValue = editTextValue.text.toString()
            greetingText.text = "Welcome $gotValue"
        }
    }
}