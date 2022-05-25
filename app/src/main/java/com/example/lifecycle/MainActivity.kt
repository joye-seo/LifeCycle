package com.example.lifecycle

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(this,"first-onCreate",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"first-onStart",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this,"first-onResume",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onResume")

    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this,"first-onPause",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onPause")

    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"first-onStop",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onStop")

    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,"first-onRestart",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"first-onDestroy",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onDestroy")

    }

}