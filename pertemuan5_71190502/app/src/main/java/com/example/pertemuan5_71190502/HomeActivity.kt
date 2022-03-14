package com.example.pertemuan5_71190502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvGreeting = findViewById<TextView>(R.id.tv_greeting)
        val nama = intent.getStringExtra("name")

        tvGreeting.text= "Selamat Datang $nama"
    }
}