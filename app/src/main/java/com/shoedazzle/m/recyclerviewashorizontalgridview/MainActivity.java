package com.shoedazzle.m.recyclerviewashorizontalgridview;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList personName = new ArrayList<>(Arrays.asList("Image1","Image2","Image3","Image4","Image5","Image6","Image7","Image8","Image9","Image10",
            "Image11","Image12","Image13","Image14","Image15",
            "Image16","Image17","Image18","Image19","Image20","Image21","Image22","Image23","Image24","Image25",
            "Image26","Image27","Image28","Image29"));
    ArrayList personImage = new ArrayList<>(Arrays.asList(R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11,R.drawable.image12,R.drawable.image13,R.drawable.image14,
           R.drawable.image15,R.drawable.image16,R.drawable.image17,R.drawable.image18,R.drawable.image19,R.drawable.image20,R.drawable.image21,
            R.drawable.image22,R.drawable.image23,R.drawable.image24,R.drawable.image25,R.drawable.image26,R.drawable.image27,R.drawable.image28,
            R.drawable.image29));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("First Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("Second Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("Third Tab"));
       // tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

       // fullSearch_tabLayout.addTab(fullSearch_tabLayout.newTab());

        final TabLayout tabLayout1 = (TabLayout)findViewById(R.id.tab_layout1);
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab First"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Second"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Third "));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Four"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Five"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Six"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Seven"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Eight"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Nine"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Ten"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab Eleven"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab TWELVE"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab THIRTEEN"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab FOURTEEN"));
        tabLayout1.addTab(tabLayout1.newTab().setText("Tab FIFTEEN"));




        //1. get the reference of RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //2. set a GridLayoutManager with 3 number of columns , horizontal gravity and false value for reverseLayout to show the items from start to end
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        //3.  call the constructor of CustomAdapter to send the reference and data to Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,personName,personImage);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView

    }
}
