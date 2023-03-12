package com.example.my_knowledge_hub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent= findViewById<Button> (R.id.button1)
        btnIntent. setOnClickListener {
            // open a new activity
            intent= Intent (applicationContext, Screen2::class. java)
            startActivity (intent)
        }
    }
}