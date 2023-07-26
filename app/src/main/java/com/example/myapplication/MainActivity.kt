package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txview_userName = findViewById<TextView>(R.id.username)
        val txview_pass = findViewById<TextView>(R.id.pass)
        val text_name = findViewById<TextView>(R.id.invalid)
        val text_pass = findViewById<TextView>(R.id.invalid_pass)
        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            if (txview_userName.text.toString() == "MONA" && txview_pass.text.toString() == "123456") {
                val intent = Intent(this, Main03Activity::class.java)
                startActivity(intent)


            } else if (txview_userName.text.toString() != "MONA") {
                text_name.setText("Incorrect userName")
            } else if (txview_pass.text.toString() != "123456") {
                text_name.setText("Incorrect password")
            }
        }

    }}
