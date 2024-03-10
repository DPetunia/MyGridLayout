package com.irdhina.mygridlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    GridView subjGL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subjGL = findViewById(R.id.glSubject);
        ArrayList<SubjectModal> subjModelArrayList = new
                ArrayList<SubjectModal>();
        subjModelArrayList.add(new SubjectModal("DFP50293",
                R.drawable.psp));
        subjModelArrayList.add(new SubjectModal("DFP40203",
                R.drawable.psp));
        subjModelArrayList.add(new SubjectModal("DFP40233",
                R.drawable.psp));
        subjModelArrayList.add(new SubjectModal("DFP40263",
                R.drawable.psp));
        subjModelArrayList.add(new SubjectModal("DFP50043",
                R.drawable.psp));
        subjModelArrayList.add(new SubjectModal("DFP50193",
                R.drawable.psp));
        SubjectGAdapter adapter = new SubjectGAdapter(this,
                subjModelArrayList);
        subjGL.setAdapter(adapter);
    }
}