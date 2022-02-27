package com.example.wish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {
    LottieAnimationView spk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spk = findViewById(R.id.splas);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), input.class);
            startActivity(intent);
            finish();
        }, 4500);
    }
}