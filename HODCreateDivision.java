package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HODCreateDivision extends AppCompatActivity {
    Button GoToNewActivity,GoToNewActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hodcreate_division);
        GoToNewActivity = (Button) findViewById(R.id.button2);
        GoToNewActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HODCreateDivision.this, HODCreateDivision.class);
                startActivity(intent);
            }
        });
        GoToNewActivity2 = (Button) findViewById(R.id.button3);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HODCreateDivision.this, FinalizeDept.class);
                startActivity(intent);
            }
        });
    }
}