package com.example.android.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView image1, image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = (ImageView) findViewById(R.id.imageView);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.imageView){ //we get the id of the view clicked
            image1.setVisibility(View.GONE);
            image2.setVisibility(View.VISIBLE);
        } else{
            image2.setVisibility(View.GONE);
            image1.setVisibility(View.VISIBLE);
        }
    }
}
