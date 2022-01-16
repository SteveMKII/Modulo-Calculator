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
            val numberView: TextView = findViewById(R.id.number)
            val modView: TextView = findViewById(R.id.mod)
            val number: Int = numberView.text.toString().toInt()
            val mod: Int = modView.text.toString().toInt()
            val result: String = (number % mod).toString()
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, result, duration)
            toast.show()
        }
    }
}
