package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {

    private lateinit var editA: EditText
    private lateinit var btn: Button
    private lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editA = findViewById(R.id.editTextA)
        res = findViewById(R.id.textView)
        btn = findViewById(R.id.button)

        btn.setOnClickListener {
            val s = editA.text.toString()

            val numbers = res.filter{it.isDigit()}

            var sum = 0

            for (i in numbers.indices.reversed()) {
                var digit = numbers[i].toString().toInt()

                if (digit % 2 == 0) {
                    digit *= 2

                    if (digit > 9) {
                        digit -= 9
                    }
                }

                sum += digit;
            }

            if (sum % 10 == 0) {
                res.text = "OK"
            } else {
                res.text = "Error"
            }
        }


        Log.d("RRR","onCreate()")

    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume()")
    }
}