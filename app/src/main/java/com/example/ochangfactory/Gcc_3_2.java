package com.example.ochangfactory;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class Gcc_3_2 extends AppCompatActivity {
    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_3_2);

        createMapView();
    }

    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo);
        mPhotoView.setImageResource(R.drawable.gcc_dangerous_plot_plan_3_2);
    }
}
