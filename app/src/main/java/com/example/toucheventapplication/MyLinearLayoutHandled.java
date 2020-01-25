package com.example.toucheventapplication;


import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class MyLinearLayoutHandled extends LinearLayout {

    public MyLinearLayoutHandled(Context context) {
        super(context);
    }

    public MyLinearLayoutHandled(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayoutHandled(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyLinearLayoutHandled(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayoutHandled::onInterceptTouchEvent, return true");
        return true;
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayoutHandled::dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayoutHandled::onTouchEvent, return true");
        return true;
    }
}