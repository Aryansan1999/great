package com.example.wish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Birthday extends AppCompatActivity {
    LottieAnimationView animationView;
    TextView textView1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        animationView=findViewById(R.id.frame);
        textView1= findViewById(R.id.name);
        textView2= findViewById(R.id.namewish);
        String name1 = getIntent().getStringExtra("text1");
        String wish = getIntent().getStringExtra("text2");
        textView1.setText(name1);
        textView2.setText(wish);
    }
}