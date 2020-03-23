package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Emergency extends AppCompatActivity {
    private TextView heading;
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);


        //FIND HEADING//
        heading=findViewById(R.id.HEADING);

        //FIND TWO BUTTON//
        button1=findViewById(R.id.BUTTON1);
        button2=findViewById(R.id.BUTTON2);


        //SET ACTION LISTENER FOR BUTTON1//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Emergency.this,IEDCR.class);
                startActivity(intent);
            }
        });

        //SET ACTION LISTENER FOR BUTTON2//
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Emergency.this,KuwaitMoitri.class);
                startActivity(intent);
            }
        });

    }
}
