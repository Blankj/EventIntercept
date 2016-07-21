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
public class MyViewGroupB extends LinearLayout{
    public MyViewGroupB(Context context) {
        super(context);
    }

    public MyViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroupB(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("blankj", "ViewGroupB dispatchTouchEvent" + ev.getAction());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("blankj", "ViewGroupB onInterceptTouchEvent" + ev.getAction());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("blankj", "ViewGroupB onTouchEvent" + event.getAction());
        return super.onTouchEvent(event);
    }
}
