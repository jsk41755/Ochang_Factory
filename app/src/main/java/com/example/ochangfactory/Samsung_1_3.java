package com.example.ochangfactory;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;

public class Samsung_1_3 extends AppCompatActivity {
    private PhotoView mPhotoView;
    String s1[], s2[];
    String s3[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18"};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_3);

        /*recyclerView = findViewById(R.id.recyclerView_1_3);

        s1 = getResources().getStringArray(R.array.samsung_building_situation);
        s2 = getResources().getStringArray(R.array.samsung_description_1_3);

        Menu_1_3Adapter menu_1_3Adapter = new Menu_1_3Adapter(this, s1, s2, s3);
        recyclerView.setAdapter(menu_1_3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
        createMapView();
    }

    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo);
        mPhotoView.setImageResource(R.drawable.samsung_plot_plan_1_3);
    }
}
