package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var okButton: Button = findViewById(R.id.button_ok);
        okButton.setOnClickListener {
            Toast.makeText(applicationContext, "Кнопка ОК", LENGTH_SHORT).show();
        }
    }
}