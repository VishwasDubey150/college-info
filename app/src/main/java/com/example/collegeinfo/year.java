package com.example.collegeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        Intent intent=getIntent();
        Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
        sem1=findViewById(R.id.sem1);
        sem2=findViewById(R.id.sem2);
        sem3=findViewById(R.id.sem3);
        sem4=findViewById(R.id.sem4);
        sem5=findViewById(R.id.sem5);
        sem6=findViewById(R.id.sem6);
        sem7=findViewById(R.id.sem7);
        sem8=findViewById(R.id.sem8);



    }

    public void semi(View view) {
        Intent intent=new Intent(this,Semester_I.class);
        startActivity(intent);
    }

    public void semii(View view) {
    }

    public void semiii(View view) {
    }

    public void semiv(View view) {
    }

    public void semv(View view) {
    }

    public void semvi(View view) {
    }

    public void semvii(View view) {
    }

    public void semviii(View view) {
    }

    public void tt(View view) {
        Intent intent=new Intent(this,CurrentTimeTable.class);
        startActivity(intent);

    }

    public void datesheet(View view) {
        Toast.makeText(this,"No update for exams so far",Toast.LENGTH_SHORT).show();
    }
}