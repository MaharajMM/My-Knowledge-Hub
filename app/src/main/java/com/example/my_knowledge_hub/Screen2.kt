package com.example.my_knowledge_hub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.my_knowledge_hub.details_screens.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val card1= findViewById<CardView> (R.id.android)
        val card2= findViewById<CardView> (R.id.web)
        val card3= findViewById<CardView> (R.id.artificial)
        val card4= findViewById<CardView> (R.id.machine)
        val card5= findViewById<CardView> (R.id.blockchain)
        val card6= findViewById<CardView> (R.id.web3)

        val fabButton= findViewById<FloatingActionButton> (R.id.fab)

        fabButton.setOnClickListener {
            val intent= Intent (Intent.ACTION_DIAL)
            intent. data= Uri.parse("tel:7205891875")
            startActivity(intent)
        }


        card1.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, AndroidActivity::class. java)
            startActivity (intent)
        }
        card2.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, WebActivity::class. java)
            startActivity (intent)
        }
        card3.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, AiActivity::class. java)
            startActivity (intent)
        }
        card4.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, MLActivity::class. java)
            startActivity (intent)
        }
        card5.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, BlockchainActivity::class. java)
            startActivity (intent)
        }
        card6.setOnClickListener {
            // open a new activity
            intent = Intent (applicationContext, Web3Activity::class. java)
            startActivity (intent)
        }
    }
}