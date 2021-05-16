package com.example.ochangfactory;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.github.chrisbanes.photoview.PhotoView;

public class Samsung_1_2 extends AppCompatActivity {
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
        mPhotoView.setImageResource(R.drawable.gcc_map);
    }
}
