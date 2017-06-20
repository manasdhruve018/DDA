package com.example.android.dda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentSignUp extends AppCompatActivity {
    Button GoToNewActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_sign_up);
        GoToNewActivity=(Button)findViewById(R.id.button19);
        GoToNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(StudentSignUp.this,StudentHomeMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
