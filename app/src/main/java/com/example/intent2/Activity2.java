package com.example.intent2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //actionbar title
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("Second  Activity");

        //Intent to get data
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email= intent.getStringExtra("EMAIL");
        String phone= intent.getStringExtra("PHONE");

        //TextView
        TextView mResultTv = findViewById(R.id.resultTv);

        //setText
        mResultTv.setText("Name: "+name+"\nEmail: "+email+"\nPhone: "+phone);

    }
}