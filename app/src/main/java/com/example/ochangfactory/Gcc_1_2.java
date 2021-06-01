package com.example.ochangfactory;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class Gcc_1_2 extends AppCompatActivity {
    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_1_2);

        createMapView();
    }

    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo);
        mPhotoView.setScaleType(ImageView.ScaleType.FIT_XY);
        mPhotoView.setImageResource(R.drawable.gcc_1_2_graph);
    }
}
