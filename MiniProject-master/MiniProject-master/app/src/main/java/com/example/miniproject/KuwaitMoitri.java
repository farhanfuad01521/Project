package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KuwaitMoitri extends AppCompatActivity {



    private TextView heading;
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuwait_moitri);
        //FIND HEADING//
        heading=findViewById(R.id.HEADING);

        //FINDING BUTTON1//
        button1=findViewById(R.id.BUTTON1);

        //FINDING BUTTON2//
        button2=findViewById(R.id.BUTTON2);

        //FINDING BUTTON3//
        button3=findViewById(R.id.BUTTON3);

        //SET ACCTIONLISENER FOR BUTTON1//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KuwaitMoitri.this,KuwaitMoitriContact.class);
                startActivity(intent);
            }
        });
        //SET ACCTIONLISENER FOR BUTTON2//
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KuwaitMoitri.this,MapsActivity1.class);
                startActivity(intent);
            }
        });
        //SET ACCTIONLISENER FOR BUTTON3//
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KuwaitMoitri.this,KuwaitMoitriHealt.class);
                startActivity(intent);

            }
        });
    }
}
