package com.example.ochangfactory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Gcc_1_3 extends AppCompatActivity {
    private PhotoView mPhotoView;
    private List<GcTarget> GcList = new ArrayList<>();
    String s1[], s2[];
    String s3[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_3);

        /*recyclerView = findViewById(R.id.recyclerView_1_3);

        s1 = getResources().getStringArray(R.array.gcc_building_situation);
        s2 = getResources().getStringArray(R.array.gcc_description_1_3);


        Menu_1_3Adapter menu_1_3Adapter = new Menu_1_3Adapter(this, s1, s2, s3);
        recyclerView.setAdapter(menu_1_3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));*/
        Toast.makeText(Gcc_1_3.this, "한번 더 누르면 종료됩니다", Toast.LENGTH_SHORT).show();
        initializeAdapter();

    }

    private void initializeAdapter() {
        DatabaseReference dataRef = FirebaseDatabase.getInstance().getReference("Data");

        dataRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                createMapView();
                DataSnapshot GcSnapshot = snapshot.child("GcTarget");

                mPhotoView = findViewById(R.id.iv_photo1_3);
                mPhotoView.setImageResource(R.drawable.gcc_plot_plan2_1_3);

                if (!snapshot.hasChildren())
                    Toast.makeText(Gcc_1_3.this, "체크용", Toast.LENGTH_SHORT).show();

                GcList = new ArrayList<>();
                for (DataSnapshot data : GcSnapshot.getChildren()) {
                    GcTarget gcTarget = data.getValue(GcTarget.class);
                    GcList.add(gcTarget);
                }

                int a= 1;
                createMapView();
                Toast.makeText(Gcc_1_3.this, "로딩 완료", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private void createMapView() {
        mPhotoView = findViewById(R.id.iv_photo1_3);
        mPhotoView.setImageResource(R.drawable.gcc_plot_plan2_1_3);
        Toast.makeText(getApplicationContext(), "로딩 완료", Toast.LENGTH_SHORT).show();

        ImageButton[] GcButton = new ImageButton[GcList.size()];
        FrameLayout mapView = findViewById(R.id.GcmapView);
        final int[] GcImgList = new int[]{R.drawable.button1, R.drawable.button1, R.drawable.button1, R.drawable.button2,
                R.drawable.button2, R.drawable.button3, R.drawable.button3};

        float GctargetInitDp = 5f;
        RelativeLayout.LayoutParams arcadeParam = new RelativeLayout.LayoutParams(dpToPx(Gcc_1_3.this, GctargetInitDp * mPhotoView.getScale()), dpToPx(Gcc_1_3.this, GctargetInitDp * mPhotoView.getScale()));
        arcadeParam.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);

        for (int i = 0; i < GcList.size(); i++) {
            GcButton[i] = new ImageButton(this);
            GcButton[i].setBackgroundResource(GcImgList[GcList.get(i).getNum() - 1]);

            GcButton[i].setLayoutParams(arcadeParam);
            RectF rect = mPhotoView.getDisplayRect();
            GcButton[i].setX((rect.left + ((rect.right - rect.left) * GcList.get(i).getX()) - arcadeParam.width / 2.0f));
            GcButton[i].setY((rect.top + ((rect.bottom - rect.top) * GcList.get(i).getY()) - arcadeParam.height / 2.0f));
            mapView.addView(GcButton[i]);
            GcButton[i].setVisibility(View.INVISIBLE);
        }

        mPhotoView.setOnMatrixChangeListener(rect -> {
            for (int i = 0; i < GcList.size(); i++) {
                FrameLayout.LayoutParams tmp = (FrameLayout.LayoutParams) GcButton[i].getLayoutParams();
                tmp.width = dpToPx(Gcc_1_3.this,GctargetInitDp * mPhotoView.getScale());
                tmp.height = dpToPx(Gcc_1_3.this,GctargetInitDp * mPhotoView.getScale());
                GcButton[i].setLayoutParams(tmp);
            }

            for (int i = 0; i < GcList.size(); i++) {
                GcButton[i].setX((rect.left + ((rect.right - rect.left) * GcList.get(i).getX()) - GcButton[i].getLayoutParams().width / 2.0f));
                GcButton[i].setY((rect.top + ((rect.bottom - rect.top) * GcList.get(i).getY()) - GcButton[i].getLayoutParams().height / 2.0f));
            }
        });
    }

    public int dpToPx(Context context, float dp) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }
}
