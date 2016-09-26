package kr.hs.emirim.kyr9909.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyImage(getApplicationContext()));
    }

    class MyImage extends View{
        MyImage(Context context){
            super(context);
        }

//        protected void onDraw(Canvas canvas){
//            super.onDraw(canvas);
//            Bitmap picture= BitmapFactory.decodeResource(getResources(), R.drawable.puppy);
//            float cx=getWidth()/2.0f;
//            float cy=getHeight()/2.0f;
//            float x=(getWidth()-picture.getWidth())/2.0f;
//            float y=(getHeight()-picture.getHeight())/2.0f;
//            //canvas.rotate(45,cx,cy); 회전이동
//            canvas.translate(-150,200);
//            canvas.drawBitmap(picture,x,y,null);
//        }
    }
}
