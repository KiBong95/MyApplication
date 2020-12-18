package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class Fragement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragement)
        Log.d("life_cycle","onCreate")

        val button : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        val fragment_one : Fragement_one = Fragement_one()

        button.setOnClickListener {

            val fragmentManager : FragmentManager = supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container ,fragment_one )
            fragmentTransaction.commit()

            val bundle : Bundle = Bundle()
            bundle.putString("hello", "hello")
            fragment_one.arguments = bundle
        }

        button2.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTrasacion = fragmentManager.beginTransaction()
            fragmentTrasacion.remove(fragment_one)
            fragmentTrasacion.commit()
        }



    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","onDestroy")
    }
}