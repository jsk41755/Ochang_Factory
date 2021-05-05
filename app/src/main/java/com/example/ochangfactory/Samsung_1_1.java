package com.example.ochangfactory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.github.chrisbanes.photoview.PhotoView;

public class Samsung_1_1 extends AppCompatActivity {

    private PhotoView mPhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_1_1);

        mPhotoView = findViewById(R.id.iv_photo);

        Drawable bitmap = ContextCompat.getDrawable(this, R.drawable.wallpaper);
        mPhotoView.setImageDrawable(bitmap);

    }
}