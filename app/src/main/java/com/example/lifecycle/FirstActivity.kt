package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycle.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(this, "first-onCreate", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onCreate")
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "first-onStart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "first-onResume", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onResume")

    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "first-onPause", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onPause")

    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "first-onStop", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onStop")

    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "first-onRestart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "first-onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_first", "first-onDestroy")

    }

}