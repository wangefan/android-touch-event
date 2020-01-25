package com.example.toucheventapplication;


import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class MyLinearLayout extends LinearLayout {

    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayout::onInterceptTouchEvent");
        return super.onInterceptTouchEvent(event);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayout::dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("demo", MotionEvent.actionToString(event.getAction()) + ", MyLinearLayout::onTouchEvent");
        return super.onTouchEvent(event);
    }
}