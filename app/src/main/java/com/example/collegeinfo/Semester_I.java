package com.example.collegeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Semester_I extends AppCompatActivity {
    ListView list1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_i);
        Intent intent=getIntent();
        list1=findViewById(R.id.list1);
        ArrayList<String>sub=new ArrayList<String>();
        sub.add("Computional Programming and thinking");
        sub.add("Engineering calculas");
        sub.add("Biological System");
        sub.add("new age life skills");
        sub.add(("Electromagnetism"));
        sub.add(("Introduction to engineering"));

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sub);
        list1.setAdapter(arrayAdapter);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Comming soon", Toast.LENGTH_SHORT).show();
            }
        });


    }
}