package com.example.pertemuan6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val btnFirst = findViewById<Button>(R.id.button2)
        btnFirst.setOnClickListener{
            val j = Intent(this, Activity3::class.java)
            startActivity(j)
        }


    }}