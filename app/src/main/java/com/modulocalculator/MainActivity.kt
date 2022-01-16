package com.modulocalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculate: Button = findViewById(R.id.result)
        calculate.setOnClickListener{
            val divisorView: TextView = findViewById(R.id.divisor)
            val dividendView: TextView = findViewById(R.id.dividend)
            val divisor: Int = divisorView.text.toString().toInt()
            val dividend: Int = dividendView.text.toString().toInt()
            val result: String = (divisor % dividend).toString()
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, result, duration)
            toast.show()
        }
    }
}
