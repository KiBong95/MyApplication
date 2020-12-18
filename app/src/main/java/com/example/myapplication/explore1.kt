package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText

class explore1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val edit : EditText = findViewById(R.id.edit)
        val search_edit : Button = findViewById(R.id.search_edit)

        search_edit.setOnClickListener{
            val address = "https://" + edit.text.toString()
            Log.d("text",address)
            val searchindent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(searchindent)
        }

        edit.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.d("afterTextChanged" , "" + s)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("beforeTextChanged" , "" + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("onTextChanged" , "" + s)
            }
        })

    }
}