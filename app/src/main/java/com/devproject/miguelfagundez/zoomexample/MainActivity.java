package com.devproject.miguelfagundez.zoomexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Views
    private ImageView image;

    //Members
    private ScaleGestureDetector gestureDetector;
    private float factor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViewsAndMembers();
    }

    private void setupViewsAndMembers() {
        image = findViewById(R.id.ivImage);
        factor = 1.0f;
        gestureDetector = new ScaleGestureDetector(this, new ZoomListener());
    }

    // Detecting touch event in view
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    // Inner class to setup the scale factor to the image
    private class ZoomListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        @Override
        public boolean onScale(ScaleGestureDetector detector){
            factor *= gestureDetector.getScaleFactor();
            image.setScaleX(factor);
            image.setScaleY(factor);
            return true;
        }
    }
}