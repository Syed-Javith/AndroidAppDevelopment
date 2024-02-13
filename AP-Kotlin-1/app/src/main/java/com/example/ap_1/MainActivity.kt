package com.example.ap_1

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var greetingText : TextView
    private lateinit var editText : EditText
    private lateinit var inputButton : Button
    private lateinit var offerButton : Button
    private lateinit var sharedPreference : SharedPreferences
    private lateinit var editor : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetingText = findViewById<TextView>(R.id.tvHello)
        editText = findViewById<EditText>(R.id.tvInput)
        inputButton = findViewById<Button>(R.id.tvButton)
        offerButton = findViewById<Button>(R.id.btnOffer)
        sharedPreference = getSharedPreferences("sf", MODE_PRIVATE)
        editor = sharedPreference.edit()
        var gotValue : String = ""
        inputButton.setOnClickListener(){
           gotValue = editText.text.toString()
            if(gotValue==""){
                Toast.makeText(this@MainActivity,"Name is empty",Toast.LENGTH_SHORT).show()
                offerButton.visibility = View.INVISIBLE
                return@setOnClickListener
            }
            greetingText.text = "Welcome $gotValue"
            offerButton.visibility = View.VISIBLE
//            editText.text.clear()
        }
        offerButton.setOnClickListener(){
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("USER",gotValue)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        val sharedValue = editText.text.toString()
        editor.apply(){
            putString("sValue",sharedValue)
            commit()
        }
    }

    override fun onResume() {
        super.onResume()
        val retrieveValue = sharedPreference.getString("sValue",null)
        greetingText.text = retrieveValue
    }
}