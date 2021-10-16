package com.example.collegeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CurrentTimeTable extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_time_table);
        Intent intent=getIntent();


            }



    public void wednesday(View view) {
        Intent intent=new Intent(this,Wed.class);
        startActivity(intent);
    }

    public void thursday(View view) {
        Intent intent=new Intent(this,Thu.class);
        startActivity(intent);
    }

    public void friday(View view) {
        Intent intent=new Intent(this,Fri.class);
        startActivity(intent);
    }

    public void saturday(View view) {
        Intent intent=new Intent(this,Sat.class);
        startActivity(intent);
    }

    public void mond(View view) {
        Intent intent=new Intent(this,monda.class);
        startActivity(intent);
    }

    public void tuesd(View view) {
        Intent intent=new Intent(this,tuesda.class);
        startActivity(intent);
    }
}
