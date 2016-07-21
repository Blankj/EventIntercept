package com.blankj.eventintercept;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/*********************************************
 * author: Blankj on 2016/7/21 09:47
 * blog:   http://blankj.com
 * e-mail: blankj@qq.com
 *********************************************/
public class MyViewGroupA extends LinearLayout {
    public MyViewGroupA(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyViewGroupA(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroupA(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("blankj", "ViewGroupA dispatchTouchEvent" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("blankj", "ViewGroupA onInterceptTouchEvent" + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("blankj", "ViewGroupA onTouchEvent" + event.getAction());
        return super.onTouchEvent(event);
    }
}







