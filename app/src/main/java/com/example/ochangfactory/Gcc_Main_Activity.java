package com.example.ochangfactory;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Gcc_Main_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    static final float END_SCALE = 0.7f;

    //Drawer Menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    LinearLayout contentView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcc_main_activity);

        menuIcon = findViewById(R.id.gcc_menu_icon);

        drawerLayout = findViewById(R.id.gc_drawer_layout);
        navigationView = findViewById(R.id.gc_navi_view);
        contentView = findViewById(R.id.gc_content);

        navigationDrawer();
        drawerLayout.openDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerVisible(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
            super.onBackPressed();
    }

    private void navigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);

        menuIcon.setOnClickListener(v -> {
            if(drawerLayout.isDrawerVisible(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            }
            else drawerLayout.openDrawer(GravityCompat.START);
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                final float diffScaleOffset = slideOffset * (1- END_SCALE);
                final float offsetScale = 1 - diffScaleOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaleOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.nav1_1:
                startActivity(new Intent(getApplicationContext(),Gcc_1_1.class));
                break;
            case  R.id.nav1_2:
                startActivity(new Intent(getApplicationContext(),Gcc_1_2.class));
                break;
            case  R.id.nav1_3:
                startActivity(new Intent(getApplicationContext(),Gcc_1_3.class));
                break;
            case  R.id.nav2_1:
                startActivity(new Intent(getApplicationContext(),Gcc_2_1.class));
                break;
            case  R.id.nav3_1:
                startActivity(new Intent(getApplicationContext(),Gcc_3_1.class));
                break;
            case  R.id.nav3_2:
                startActivity(new Intent(getApplicationContext(),Gcc_3_2.class));
                break;
        }

        return true;
    }
}
