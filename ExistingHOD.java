package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExistingHOD extends AppCompatActivity {
    Button GoToNewActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_hod);
        GoToNewActivity=(Button)findViewById(R.id.button13);
        GoToNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(ExistingHOD.this,HodHomeMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
