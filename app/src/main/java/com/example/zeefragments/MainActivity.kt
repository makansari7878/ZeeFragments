package com.example.zeefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var redButton = findViewById<Button>(R.id.buttonRed)
        var blueButton = findViewById<Button>(R.id.buttonBlue)

        redButton.setOnClickListener {
                var redFragment = RedFragment()
            var myFragmentManager = supportFragmentManager
            var myFragmentTransition = myFragmentManager.beginTransaction()
            myFragmentTransition.replace(R.id.fragmentGreen, redFragment)
            myFragmentTransition.commit()
        }

        blueButton.setOnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.fragmentGreen, BlueFragment()).commit()

        }
    }
}