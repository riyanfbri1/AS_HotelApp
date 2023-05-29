package com.riyan.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://www.pantainesia.com/wp-content/uploads/2018/08/pantai-samudra-indah-1248x703.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}