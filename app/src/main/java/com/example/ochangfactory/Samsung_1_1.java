package com.example.ochangfactory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;


public class Samsung_1_1 extends AppCompatActivity {

    private TextView title;
    private TextView object;
    private TextView address;
    private TextView building_situation;
    private TextView public_fireplug;
    private TextView private_fireplug;
    private TextView firefighting_safety_supervisor;
    private TextView dangerous_safety_supervisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1);

        title = findViewById(R.id.title_1);
        object = findViewById(R.id.object_1);
        address = findViewById(R.id.address);
        building_situation = findViewById(R.id.building_situation);
        public_fireplug = findViewById(R.id.public_fireplug);
        private_fireplug = findViewById(R.id.private_fireplug);
        firefighting_safety_supervisor = findViewById(R.id.firefighting_safety_supervisor);
        dangerous_safety_supervisor = findViewById(R.id.dangerous_safety_supervisor);

        title.setText(" 삼성SDI 기본현황 ");
        object.setText(" 삼성SDI");
        address.setText("청주시 청워구 오창읍\n과학산업4로 146-0");
        building_situation.setText("15개동(공장3,기계실5,창고6,\n사무1)연면적51,249" + "2 m\u00B2");
        public_fireplug.setText("오창과학상 88호,89호");
        private_fireplug.setText("공장내 18개소 설치");
        firefighting_safety_supervisor.setText("이상엽 010-5481-0642\n" + "최경집 010-3428-3119");
        dangerous_safety_supervisor.setText("장문석 010-2255-9648\n" + "이종영 010-2330-6102");

    }
}