package com.example.ochangfactory;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageButton Samsung_SDI_Btn;
    private long backBtnTime = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Samsung_SDI_Btn = findViewById(R.id.samsung_sdi_logo);
        Samsung_SDI_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Samsung_Main_Acticity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {//뒤로가기 두 번 눌를 시 종료
        long curTime = System.currentTimeMillis();
        long gaptime = curTime - backBtnTime;

        if (0 <= gaptime && 2000 >= gaptime) {
            // 태스크를 백그라운드로 이동
            moveTaskToBack(true);
            finishAndRemoveTask();
            android.os.Process.killProcess(android.os.Process.myPid());
        } else {
            backBtnTime = curTime;
            Toast.makeText(this, "한번 더 누르면 종료됩니다", Toast.LENGTH_SHORT).show();
        }
        //super.onBackPressed();
    }



}