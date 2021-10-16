package com.example.collegeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText roll;
    Button next;
    String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=findViewById(R.id.Name);
        roll=findViewById(R.id.roll);
        next=findViewById(R.id.next);
        r=roll.getText().toString();

    }

    public void check1(View view) {
            if(r.startsWith("E21CSE"))
            {
                Intent intent = new Intent(this, year.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this,"Invalid roll no.",Toast.LENGTH_SHORT).show();
            }


    }

    public void skip(View view) {
        Intent intent=new Intent(this,year.class);
        startActivity(intent);
    }
}