package com.example.marcus.playaround;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Canvas c= new Canvas();

        BouncingBallView bbw = (BouncingBallView) findViewById(R.id.view);
        bbw.setBackgroundColor(Color.RED);

       // Bitmap bitmap= Bitmap.createBitmap(bbw.getWidth(),bbw.getHeight(), Bitmap.Config.ARGB_8888);


        bbw.onDraw(c);
        //bbw.setImageBitmap(bitmap);
    }


}
