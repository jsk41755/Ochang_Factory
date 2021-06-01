package com.example.ochangfactory;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Gcc_1_1 extends AppCompatActivity {

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

        title.setText(" 녹십자 기본현황 ");
        object.setText(" 녹십자");
        address.setText("청주시 청워구 오창읍\n과학산업2로 586-0");
        building_situation.setText("19개동(공장6,실험동2,폐기물처리2,\n사무2, 기타8)연면적108,207" + "2 m\u00B2");
        public_fireplug.setText("오창과학상 133호,119호");
        private_fireplug.setText("공장내 16개소 설치");
        firefighting_safety_supervisor.setText("김충식 010-9696-0788\n" + "홍진호 010-6855-5431");
        dangerous_safety_supervisor.setText("김충식 010-9696-0788\n" + "최종현 010-7147-2834");

    }
}
