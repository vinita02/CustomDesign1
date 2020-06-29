package com.shoedazzle.m.recyclerviewashorizontalgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList personName = new ArrayList<>(Arrays.asList("Image1","Image2","Image3","Image4","Image5","Image6","Image7","Image8","Image9","Image10"));
    ArrayList personImage = new ArrayList<>(Arrays.asList(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //1. get the reference of RecyclerView
          RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //2. set a GridLayoutManager with 3 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),1, LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        //3.  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(HomeActivity.this,personName,personImage);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}
