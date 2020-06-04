package com.example.lesson12_b_imageview_prog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = new ImageView(this);
        // применяем ресурс

        imageView.setImageResource(R.drawable.mountains);
        setContentView(imageView);
    }
}
