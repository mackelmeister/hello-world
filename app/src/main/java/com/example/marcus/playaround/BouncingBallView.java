package com.example.marcus.playaround;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Marcus on 19/05/2016.
 */
public class BouncingBallView extends ImageView {
    int pos_x;
    int pos_y;
    int w;
    int hi;
    int speed_x=10;
    int speed_y=20;

    private Handler h;
    private Runnable r = new Runnable() {  public void run() { invalidate();}};



    public BouncingBallView(Context c, AttributeSet a){
        super(c,a);

    }

    public void onSizeChanged(int w, int h ,int oldw, int oldh){
        if (oldh!=h||oldw!=w) {
            pos_x = w / 2;
            pos_y = h / 2;
            this.w=w;
            this.hi=h;
        }
    }

    public void onDraw(Canvas c){

        int width= getWidth();
        int height= getHeight();

        Paint p = new Paint(Color.CYAN);
        p.setARGB(255,0,255,0);
        onSizeChanged(width, height, w, hi);
        c.drawCircle(pos_x,pos_y,80,p);

        pos_x+=speed_x;
        pos_y+=speed_y;
        if (pos_x < 80 || pos_x > width-80){
            speed_x=-speed_x;
        }
        if (pos_y<80 || pos_y > height-80) {
            speed_y=-speed_y;
        }

        try{
            Thread.sleep(30);
        } catch (InterruptedException e) {}
        invalidate();

    }


}
