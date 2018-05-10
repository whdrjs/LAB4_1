package com.example.lab4_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyDrawEx extends View {
    int x,y;    //touch position
    Paint paint;
    Path path;

    //set path
    public void init()
    {
        paint= new Paint();
        path= new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5f);   //font size
    }

        public MyDrawEx(Context context) {
            super(context);
            init();
        }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
       canvas.drawPath(path, paint);        //drawing
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        x=(int) event.getX();
        y=(int) event.getY();

        if(event.getAction()==MotionEvent.ACTION_DOWN)
        {
           path.moveTo(x,y);
        }
        else if(event.getAction()==MotionEvent.ACTION_MOVE)
        {
           path.lineTo(x, y);
        }
        else if(event.getAction()==MotionEvent.ACTION_UP)
        {
           return true;
        }
        invalidate();
        return true;
    }

}