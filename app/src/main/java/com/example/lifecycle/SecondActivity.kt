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

        this.toast("second-onCreate")
        Log.d("lifecycle_second", "second-onCreate")
    }

    override fun onStart() {
        super.onStart()

        this.toast("second-onStart")
        Log.d("lifecycle_second", "second-onStart")
    }

    override fun onResume() {
        super.onResume()

        this.toast("second-onResume")
        Log.d("lifecycle_second", "second-onResume")

    }

    override fun onPause() {
        super.onPause()

        this.toast("second-onPause")
        Log.d("lifecycle_second", "second-onPause")

    }

    override fun onStop() {
        super.onStop()

        this.toast("second-onStop")
        Log.d("lifecycle_second", "second-onStop")

    }

    override fun onRestart() {
        super.onRestart()

        this.toast("second-onRestart")
        Log.d("lifecycle_second", "second-onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        this.toast("second-onDestroy")
        Log.d("lifecycle_second", "second-onDestroy")

    }
}