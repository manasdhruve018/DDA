package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentSignUpSignInActivity extends AppCompatActivity {
    Button GoToNewActivity1,GoToNewActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up_sign_in);
        GoToNewActivity1=(Button)findViewById(R.id.button14);
        GoToNewActivity1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent1=new Intent(StudentSignUpSignInActivity.this,StudentSignUp.class);
                startActivity(intent1);
            }
        });
        GoToNewActivity2=(Button)findViewById(R.id.button13);
        GoToNewActivity2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent2=new Intent(StudentSignUpSignInActivity.this,StudentHomeMainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
