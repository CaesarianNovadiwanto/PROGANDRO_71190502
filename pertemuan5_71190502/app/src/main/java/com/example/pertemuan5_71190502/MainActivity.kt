package com.example.pertemuan5_71190502

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.et_username)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btLogin = findViewById<Button>(R.id.bt_login)
        val btRegister = findViewById<Button>(R.id.bt_register)

        btLogin.setOnClickListener {
            if (etUsername!=null && etPassword!=null){
                val nama = etUsername.toString()
                val i = Intent(this,HomeActivity::class.java)
                i.putExtra("name",nama)
            }else{
                Toast.makeText(this,"username atau password harus terisi",Toast.LENGTH_SHORT).show()
            }
        }
    }
}