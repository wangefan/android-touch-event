package com.example.toucheventapplication;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class MyTextViewHandled extends TextView {
    public MyTextViewHandled(Context context) {
        super(context);
    }

    public MyTextViewHandled(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextViewHandled(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyTextViewHandled(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + " ,MyTextViewHandled::onTouchEvent, return true");
        return true;
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("demo",MotionEvent.actionToString(event.getAction()) + ", MyTextViewHandled::dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }
}