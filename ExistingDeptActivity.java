package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExistingDeptActivity extends AppCompatActivity {
    Button GoToNewActivity1,GoToNewActivity2,GoToNewActivity3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing_dept);
        GoToNewActivity1=(Button)findViewById(R.id.button3);
        GoToNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1=new Intent(ExistingDeptActivity.this,ExistingHOD.class);
                startActivity(intent1);
            }
        });
        GoToNewActivity2=(Button)findViewById(R.id.button4);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent2=new Intent(ExistingDeptActivity.this,FacultySignUpSignInActivity.class);
                startActivity(intent2);
            }
        });
        GoToNewActivity3=(Button)findViewById(R.id.button5);
        GoToNewActivity3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent3=new Intent(ExistingDeptActivity.this,StudentSignUpSignInActivity.class);
                startActivity(intent3);
            }
        });
    }
}
