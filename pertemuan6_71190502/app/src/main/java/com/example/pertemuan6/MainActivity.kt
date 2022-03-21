package com.example.pertemuan6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFirst = findViewById<Button>(R.id.button1)
        btnFirst.setOnClickListener{
            val j = Intent(this, Activity2::class.java)
            startActivity(j)
    }


}}