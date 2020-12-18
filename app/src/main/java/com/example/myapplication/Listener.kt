package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView



class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)

        var number = 10

        val textView : TextView = findViewById(R.id.hello)
        val image : ImageView = findViewById(R.id.image)

        textView.setOnClickListener{
            Log.d("click","Click")
            textView.setText("안녕하세요")
            image.setImageResource(R.drawable.gradiant1)
            number += 10
            Log.d("number", ""+number)
        }
    }



}