package com.metapp.indianapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    private static int SPLASH_SCREEN = 4000;
    Animation topAnim, bottomAnim;
    ImageView background;
    ImageView logo;
    TextView love;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo = findViewById(R.id.logo);
        background = findViewById(R.id.backgg);
        love   = findViewById(R.id.love);
        logo.setAnimation(bottomAnim);
        background.setAnimation(topAnim);
        love.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intentt = new Intent(splashscreen.this,category.class);
                startActivity(intentt);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
