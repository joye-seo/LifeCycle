package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivity.setOnClickListener {
          finish()
        }

        Toast.makeText(this, "second-onCreate", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onCreate")
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "second-onStart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this, "second-onResume", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onResume")

    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "second-onPause", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onPause")

    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "second-onStop", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onStop")

    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "second-onRestart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "second-onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_second", "second-onDestroy")

    }
}