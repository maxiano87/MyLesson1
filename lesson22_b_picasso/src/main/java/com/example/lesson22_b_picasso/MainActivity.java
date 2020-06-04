package com.example.lesson22_b_picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.image_view);
        String url = "https://easybounce.kz/image/cache/SC3310-100-1440x1080.jpg";
        Picasso.get()
                .load(url)
                .fit()
                .centerCrop()
                .into(imageView);

       /* ImageView imageView1 = findViewById(R.id.image_view1);
        String url1 = "https://www.sport.ru/ai/files/tags_attrs/r444/4ceab4b43b7d.png";
        Picasso.get()
                .load(url1)
                .fit()
                .centerCrop()
                .into(imageView1);

        ImageView imageView2 = findViewById(R.id.image_view2);
        String url2 = "https://www.sport.ru/ai/files/tags_attrs/r444/4ceab4b43b7d.png";
        Picasso.get()
                .load(url2)
                .fit()
                .centerCrop()
                .into(imageView2);*/
    }
}
