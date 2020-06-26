package com.shoedazzle.m.recyclerviewashorizontalgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        selectedImage = findViewById(R.id.selectedImage);   // init a ImageView

        Intent intent = getIntent(); // get Intent which was set from adapter of Previous Activity
        selectedImage.setImageResource(intent.getIntExtra("image",0));  // get image from Intent and set it in ImageView
    }
}
