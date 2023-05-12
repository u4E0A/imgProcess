package com.example.imgProcess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.imgprocess.R;

public class BeginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        Button openFromFile = findViewById(R.id.button_openFromFile);
        openFromFile.setOnClickListener(v -> {
            Toast.makeText(this,"good",Toast.LENGTH_SHORT).show();
        });

        Button takePhoto = findViewById(R.id.button_takePhoto);
        takePhoto.setOnClickListener(v -> {
            Toast.makeText(this,"good",Toast.LENGTH_SHORT).show();
        });
    }
}