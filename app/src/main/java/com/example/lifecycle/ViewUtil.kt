package com.example.lifecycle

import android.app.Activity
import android.content.Context
import android.widget.Toast


//확장함수!!
fun Context.toast(message:String) =
    Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
