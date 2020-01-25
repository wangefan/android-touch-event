package com.example.toucheventapplication

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onTouchEvent(event: MotionEvent): Boolean {
        Log.e("demo", "${MotionEvent.actionToString(event.action)}, MainActivity::onTouchEven()")
        return super.onTouchEvent(event)
    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {

        Log.e("demo", "${MotionEvent.actionToString(event.action)}, MainActivity::dispatchTouchEvent")
        return super.dispatchTouchEvent(event)
    }
}
