package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        val buttonShared : Button = findViewById(R.id.buttonShared)
        val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = sharedPreference.edit()
        editor.putString("hello","안녕하세요")
        editor.commit()

        buttonShared.setOnClickListener {
            val sharedPreferences = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value = sharedPreference.getString("hello","데이터 없음")
            Log.d("key-value", "Value :" + value)
        }


    }
}