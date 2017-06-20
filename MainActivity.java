package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button GoToNewActivity1,GoToNewActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GoToNewActivity1=(Button)findViewById(R.id.nd);
        GoToNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,NewDeptActivity.class);
                startActivity(intent);
            }
        });
        GoToNewActivity2=(Button)findViewById(R.id.ed);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,ExistingDeptValidationActivity.class);
                startActivity(intent);
            }
        });
    }
}
