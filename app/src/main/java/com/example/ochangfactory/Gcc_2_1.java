package com.example.ochangfactory;

import android.content.pm.ActivityInfo;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class Gcc_2_1 extends AppCompatActivity {
    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_2_1);

        createMapView();
    }

    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo);
        mPhotoView.setImageResource(R.drawable.gcc_firefighting_graph_2_1);
    }
}
