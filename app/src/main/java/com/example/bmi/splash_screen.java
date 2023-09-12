package com.example.bmi;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class splash_screen extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

       Objects.requireNonNull(getSupportActionBar()).hide();

        new Handler().postDelayed(() -> {

            Intent imageView = new Intent(splash_screen.this, MainActivity.class);
            startActivity(imageView);
            finish();
        }, 2000);




    }
}