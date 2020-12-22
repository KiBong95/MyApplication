package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val text = resources.getString(R.string.text_resource)
        Log.d("text", text)
        val text2 = getString(R.string.app_name)
        Log.d("text", text2)

        val color = getColor(R.color.bong)
        val resourceButton : Button = findViewById(R.id.resourceButton)

        resourceButton.setOnClickListener{
            resourceButton.setBackgroundColor(color)
        }

    }
}