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
    private lateinit var editB: EditText
    private lateinit var editC: EditText
    private lateinit var btn: Button
    private lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editA = findViewById(R.id.editTextA)
        editB = findViewById(R.id.editTextB)
        editC = findViewById(R.id.editTextC)
        btn = findViewById(R.id.button)
        res = findViewById(R.id.textView)

        btn.setOnClickListener {
            val a = editA.text.toString().toDouble()
            val b = editB.text.toString().toDouble()
            val c = editC.text.toString().toDouble()

            val d = b*b - 4*a*c
            when {
                d == 0.0 -> {
                    val x = -b/(2*a)
                    res.text = getString(R.string.x, x.toString())
                }
                d < 0 -> {
                    res.text = getString(R.string.not_solve)
                }
                else -> {
                    val x1 = -b + sqrt(d)/(2*a)
                    val x2 = -b - sqrt(d)/(2*a)
                    res.text = getString(R.string.x1_x2,x1.toString(), x2.toString())
                }
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