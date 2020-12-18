package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val change_activity : Button = findViewById(R.id.change_activity)

        change_activity.setOnClickListener{
            val intent = Intent(this@Intent1,Intent2::class.java)

            intent.apply {
                this.putExtra("number1" , 1)
                this.putExtra("number2" , 2)
            }
            startActivityForResult(intent,200)

        }

        val intnet1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naver.com/"))
        startActivity(intnet1)
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        Log.d("number",""+ requestCode)
        Log.d("number", "" +resultCode)


        val result = data?.getIntExtra("result",0)
        Log.d("result", ""+ result)

        super.onActivityResult(requestCode, resultCode, data)
    }
}