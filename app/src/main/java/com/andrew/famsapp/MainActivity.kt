package com.andrew.famsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainc = findViewById<TextView>(R.id.MainCampus)
        val logIn = findViewById<TextView>(R.id.login)
        val register = findViewById<TextView>(R.id.register)

        mainc.setOnClickListener{
            Intent(this, MainCampus::class.java).also{
                startActivity(it)
            }
        }

        logIn.setOnClickListener {
            Intent(this,Login::class.java).also{
                startActivity(it)
            }
        }

        register.setOnClickListener {
            Intent(this, register::class.java).also{
                startActivity(it)
            }
        }

    }
}