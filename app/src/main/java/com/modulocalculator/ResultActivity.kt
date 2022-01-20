package com.modulocalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent: String? = intent.getStringExtra("result")
        val resultView:  TextView = findViewById(R.id.resultVal)
        resultView.text = intent
    }
}