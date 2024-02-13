package com.example.mad_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        val textBox = findViewById<TextView>(R.id.tvText)

        btn.setOnClickListener(){
            textBox.text = "Pressed"
            textBox.setTextColor(Color.RED)
            Toast.makeText(this@MainActivity,"Pressed",Toast.LENGTH_SHORT).show()
        }
    }
}