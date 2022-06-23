package com.uttamsaha.healthyindia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

lateinit var etUserName : EditText
lateinit var etPassword : EditText
lateinit var btnLogin : Button
lateinit var txtForgotPassword : TextView
val validId = "admin"
val validPassword = "12345"

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUserName = findViewById(R.id.etUserName)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)

        btnLogin.setOnClickListener {
            val userName = etUserName.text.toString()
            val password = etPassword.text.toString()
            if ((userName == validId) && (password == validPassword)) {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this@LoginActivity, "Incorrect Credential", Toast.LENGTH_LONG).show()
            }
        }
    }
}