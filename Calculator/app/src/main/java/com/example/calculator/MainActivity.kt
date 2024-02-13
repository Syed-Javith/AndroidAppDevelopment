package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Integer.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = "";
        var currentOp = "";
        var isOp = false;
        val btn0 = findViewById<Button>(R.id.btn0);
        val btn1 = findViewById<Button>(R.id.btn1);
        val btn2 = findViewById<Button>(R.id.btn2);
        val btn3 = findViewById<Button>(R.id.btn3);
        val btn4 = findViewById<Button>(R.id.btn4);
        val btn5 = findViewById<Button>(R.id.btn5);
        val btn6 = findViewById<Button>(R.id.btn6);
        val btn7 = findViewById<Button>(R.id.btn7);
        val btn8 = findViewById<Button>(R.id.btn8);
        val btn9 = findViewById<Button>(R.id.btn9);
        val AC = findViewById<Button>(R.id.btnAC);
        val textBox = findViewById<TextView>(R.id.textView2);
        val AddBtn = findViewById<Button>(R.id.btnAdd);
        val SubBtn = findViewById<Button>(R.id.btnSub);
        val MulBtn = findViewById<Button>(R.id.btnMul);
        val DivBtn = findViewById<Button>(R.id.btnDiv);
        val EqualBtn = findViewById<Button>(R.id.btnEqual);

        fun getTextValue( value : String ): Int {
            return parseInt(value);
        }


        fun setTextValue(value : String){
            text = text + value;
            textBox.setText(text)
        }
        fun calculate(){
            val nums = text.split(currentOp)
            val n1 = parseInt(nums[0]);
            val n2 = parseInt(nums[1]);
            when(currentOp) {
                "+" -> {
                    text  = ""
                    setTextValue((n1+n2).toString())
                }
                "-" -> {
                    text  = ""
                    setTextValue((n1-n2).toString())
                }
                "*" -> {
                    text  = ""
                    setTextValue((n1*n2).toString())
                }
                "/" -> {
                    text  = ""
                    val f : Float = (n1/n2).toFloat()
                    setTextValue(f.toString())
                }
            }
        }
        fun handleOperation( op : String){
//            if(text[0] <= '9' && text[text.length()-1] )
            if (isOp) {
                calculate()
                isOp = false
                currentOp = op
                setTextValue(op)
                isOp = true
//                Toast.makeText(this ,"Please enter number", Toast.LENGTH_SHORT).show()
            } else {
                currentOp = op
                isOp = true
                setTextValue(op)
            }
        }
        AC.setOnClickListener(){
            text = ""
            textBox.setText("");
        }
        AddBtn.setOnClickListener() {
            handleOperation("+")
        }
        SubBtn.setOnClickListener() {
            handleOperation("-")
        }
        MulBtn.setOnClickListener() {
            handleOperation("*")
        }
        DivBtn.setOnClickListener() {
            handleOperation("/")
        }
//        AddBtn.setOnClickListener() {
//            handleOperation("+")
//        }
        btn0.setOnClickListener(){
            setTextValue("0")
        }
        btn1.setOnClickListener(){
            setTextValue("1")
        }
        btn2.setOnClickListener(){
            setTextValue("2")
        }
        btn3.setOnClickListener(){
            setTextValue("3")
        }
        btn4.setOnClickListener(){
            setTextValue("4")
        }
        btn5.setOnClickListener(){
            setTextValue("5")
        }
        btn6.setOnClickListener(){
            setTextValue("6")
        }
        btn7.setOnClickListener(){
            setTextValue("7")
        }
        btn8.setOnClickListener(){
            setTextValue("8")
        }
        btn9.setOnClickListener(){
            setTextValue("9")
        }

    }
}