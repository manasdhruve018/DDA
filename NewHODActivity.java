package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewHODActivity extends AppCompatActivity {
    Button GoToNewActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_hod);
        GoToNewActivity2=(Button)findViewById(R.id.button);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(NewHODActivity.this,HODCreateDivision.class);
                startActivity(intent);
            }
        });
    }
}
