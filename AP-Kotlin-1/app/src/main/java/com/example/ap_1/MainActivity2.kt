package com.example.ap_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val welcomeText = findViewById<TextView>(R.id.tvWelcome)
        welcomeText.text = intent.getStringExtra("USER")
    }
}