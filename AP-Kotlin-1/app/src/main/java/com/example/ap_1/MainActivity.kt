package com.example.ap_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingText = findViewById<TextView>(R.id.tvHello)
        val editText = findViewById<EditText>(R.id.tvInput)
        val inputButton = findViewById<Button>(R.id.tvButton)
        inputButton.setOnClickListener(){
           val gotValue = editText.text.toString()
            if(gotValue==""){
                Toast.makeText(this@MainActivity,"Name is empty",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            greetingText.text = "Welcome $gotValue"
            editText.text.clear()
        }
    }
}