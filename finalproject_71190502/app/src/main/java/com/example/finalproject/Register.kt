package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()

        btnSignUp.setOnClickListener {
            val email = etEmail2.text.toString().trim()
            val password = etPassword2.text.toString().trim()

            if (email.isEmpty()) {
                etEmail2.error = "Email wajib diisi"
                etEmail2.requestFocus()
                return@setOnClickListener
            }



            if (password.isEmpty() || password.length < 6) {
                etPassword2.error = "Password minimal 6 karakter"
                etPassword2.requestFocus()
                return@setOnClickListener
            }

            registerUser(email, password)

        }

        btnLogin.setOnClickListener {
            Intent(this@Register, Login::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun registerUser(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Intent(this@Register, MainActivity::class.java).also {
                        it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(it)

                    }

                }else{
                    Toast.makeText(this, it.exception?.message, Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onStart() {
        super.onStart()
        if (auth.currentUser != null) {
            Intent(this@Register, MainActivity::class.java).also {
                it.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(it)
            }
        }
    }
}