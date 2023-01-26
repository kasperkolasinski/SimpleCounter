package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_adder)
        val upgradeBtn = findViewById<Button>(R.id.upgradeBtn)
        val textView = findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter++
            textView.text = counter.toString()

            if (counter >= 100) {
                upgradeBtn.visibility = View.VISIBLE
                upgradeBtn.setOnClickListener {
                    button.text = "Add 2"
                    button.setOnClickListener {
                        counter += 2
                        textView.text = counter.toString()
                    }
                    upgradeBtn.visibility = View.INVISIBLE
                }
            }
        }
    }
}