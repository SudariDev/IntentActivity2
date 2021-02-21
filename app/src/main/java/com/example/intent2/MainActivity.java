package com.example.intent2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.intent2.R.id.saveBtn;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //actionbar title
        ActionBar actionBar =getSupportActionBar();
        actionBar.setTitle("First Activity");

        //EditText
        EditText mNameEt = findViewById(R.id.nameEt);
        EditText mEmailEt = findViewById(R.id.emailEt);
        EditText mPhoneEt = findViewById(R.id.phoneEt);

        //Button
        Button mSaveBtn = findViewById(R.id.saveBtn);

        //button click listener
        mSaveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //get date from edit text
                String name = mNameEt.getText().toString();
                String email = mEmailEt.getText().toString();
                String phone = mPhoneEt.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("NAME",name);
                intent.putExtra("EMAIL",email);
                intent.putExtra("PHONE",phone);
                startActivity(intent);

            }
        });

    }
}