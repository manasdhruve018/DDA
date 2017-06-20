package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultySignUpSignInActivity extends AppCompatActivity {
    Button GoToNewActivity1,GoToNewActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_sign_up_sign_in);
        GoToNewActivity1=(Button)findViewById(R.id.button11);
        GoToNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1=new Intent(FacultySignUpSignInActivity.this,FacultyHomeMainActivity.class);
                startActivity(intent1);
            }
        });
        GoToNewActivity2=(Button)findViewById(R.id.button15);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent2=new Intent(FacultySignUpSignInActivity.this,FacultyVarificationActivity.class);
                startActivity(intent2);
            }
        });
    }
}
