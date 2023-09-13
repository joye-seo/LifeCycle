package com.example.lifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.lifecycle.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    lateinit var binding: ActivityFirstBinding
    lateinit var blankFragment: BlankFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.btnFragment.setOnClickListener {
            blankFragment = BlankFragment()
            changeFragment(blankFragment)
        }

        this.toast("first-onCreate")
        Log.d("lifecycle_first", "first-onCreate")
    }

    override fun onStart() {
        super.onStart()

        this.toast("first-onStart")
        Log.d("lifecycle_first", "first-onStart")
    }

    override fun onResume() {
        super.onResume()

        this.toast("first-onResume")
        Log.d("lifecycle_first", "first-onResume")

    }

    override fun onPause() {
        super.onPause()

        this.toast("first-onPause")
        Log.d("lifecycle_first", "first-onPause")

    }

    override fun onStop() {
        super.onStop()

        this.toast("first-onStop")
        Log.d("lifecycle_first", "first-onStop")

    }

    override fun onRestart() {
        super.onRestart()

        this.toast("first-onRestart")
        Log.d("lifecycle_first", "first-onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()

        this.toast("first-onDestroy")
        Log.d("lifecycle_first", "first-onDestroy")

    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.firstFragment.id, fragment)
            .commit()
    }

}