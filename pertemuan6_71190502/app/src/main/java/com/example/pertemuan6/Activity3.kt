package com.example.pertemuan6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)

        val btnFirst = findViewById<Button>(R.id.button3)
        btnFirst.setOnClickListener{
            val j = Intent(this, MainActivity::class.java)
            startActivity(j)
        }


    }}