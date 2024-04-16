package ru.appsmile.doubleactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passwordEditText1 = findViewById<EditText>(R.id.passwordEditText1)
        val passwordEditText2 = findViewById<EditText>(R.id.passwordEditText2)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener{
            val password1 = passwordEditText1.text.toString()
            val password2 = passwordEditText2.text.toString()

            if (password1 == password2 && password1.length >= 8) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                    Toast.makeText(this, "Пароль не правильный или слишком короткий", Toast.LENGTH_SHORT).show()
            }
        }
    }




}

