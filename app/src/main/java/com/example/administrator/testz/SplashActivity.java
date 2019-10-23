package com.example.administrator.testz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    private Button btn_bottom,btn_slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btn_bottom = (Button)findViewById(R.id.btn_bottom);
        btn_slide = (Button)findViewById(R.id.btn_slide);

        btn_bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(intent1);
            }
        });

        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),TextActivity.class);
                startActivity(intent2);
            }
        });

    }


}