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
            val number = getNumber()
            val mod = getModulo()
            showResult(number, mod)
        }
    }

     fun getNumber(): Int? {
        val numberView: TextView = findViewById(R.id.number)
        return numberView.text.toString().toIntOrNull()
    }


    fun getModulo(): Int? {
        val modView: TextView = findViewById(R.id.mod)
        return modView.text.toString().toIntOrNull()
    }


    fun showResult(number: Int?, mod: Int?){
        when{
            number !is Int -> Toast.makeText(applicationContext,
                "Please enter an integer for number", Toast.LENGTH_SHORT).show()
            mod !is Int ->             Toast.makeText(applicationContext,
                "Please enter an integer for mod", Toast.LENGTH_SHORT).show()
            mod == 0 -> Toast.makeText(applicationContext, "mod cannot be 0!",
                Toast.LENGTH_SHORT).show()
            else -> {
                val result: String = (number % mod).toString()
                Toast.makeText(applicationContext, result,
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}

