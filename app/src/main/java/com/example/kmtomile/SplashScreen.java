package com.example.kmtomile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
     final int TimeToHold = 3000;

    Animation logo;
    TextView logoText ;
    TextView task;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo = AnimationUtils.loadAnimation(this,R.anim.logo_animation);
        logoText = findViewById(R.id.logoTxt);
        task = findViewById(R.id.task);
        logoText.setAnimation(logo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },TimeToHold);
    }
}