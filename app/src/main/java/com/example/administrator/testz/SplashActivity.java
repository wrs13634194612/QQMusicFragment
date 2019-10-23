package com.example.administrator.testz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private Button btn_bottom,btn_slide,btn_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        btn_bottom = (Button)findViewById(R.id.btn_bottom);
        btn_slide = (Button)findViewById(R.id.btn_slide);
        btn_list= (Button)findViewById(R.id.btn_list);

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

        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),ListTestActivity.class);
                startActivity(intent2);
            }
        });

    }


}