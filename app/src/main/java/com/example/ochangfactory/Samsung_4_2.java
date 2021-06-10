package com.example.ochangfactory;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;

public class Samsung_4_2 extends AppCompatActivity {
    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_2);

        createMapView();
    }

    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo);
        mPhotoView.setImageResource(R.drawable.samsung_chemical_dangerous_plot_plan_4_2);
    }
}
