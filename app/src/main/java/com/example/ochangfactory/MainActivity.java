package com.example.ochangfactory;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;

    CardView Samsung_SDI_Btn;
    CardView Gcc_Btn;
    private long backBtnTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();

        Samsung_SDI_Btn = findViewById(R.id.samsung_sdi_logo);
        Samsung_SDI_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Samsung_Main_Acticity.class);
                startActivity(intent);
            }
        });

        Gcc_Btn = findViewById(R.id.gcc_logo);
        Gcc_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Gcc_Main_Activity.class);
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

    @Override
    protected void onStart() {
        super.onStart();
/*        if(mCurrentUser == null){
            sendUserToLogin();
        }*/
    }

    private void sendUserToLogin() {
        Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }


}