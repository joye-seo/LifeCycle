package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this,"second-onCreate",Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onCreate")

    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"second-onStart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(this,"second-onResume", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onResume")

    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this,"second-onPause", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onPause")

    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"second-onStop", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onStop")

    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this,"second-onRestart", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this,"second-onDestroy", Toast.LENGTH_SHORT).show()
        Log.d("lifecycle_", "onDestroy")

    }
}