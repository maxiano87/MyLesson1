package com.example.lesson12_d_imageview_raspolojenie_prog;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.mountains);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        setContentView(imageView);
    }
}
