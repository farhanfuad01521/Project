package com.example.miniproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Signup extends AppCompatActivity {
    private TextView heading;
    private TextView firstname;
    private TextView lastname;
    private TextView password;
    private EditText text1;
    private EditText text2;
    private EditText text3;
    private Button button1;
    private Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //FIND HEADING//
        heading=findViewById(R.id.HEADING);

        //FINDING FIRST NAME//
        firstname=findViewById(R.id.FASTNAME);

        //FINDING LAST NAME//
        lastname=findViewById(R.id.LASTNAME);

        //FINDING PASSWORD//
        password=findViewById(R.id.PASSWORD);

        //FINDING EDIT TEXT1//
        text1=findViewById(R.id.EditTest1);

        //FINDING EDIT TEXT2//
        text2=findViewById(R.id.EditTest2);

        //FINDING EDIT TEXT3//
        text3=findViewById(R.id.EditTest3);

        //FINDING BUTTON1//
        button1=findViewById(R.id.BUTTON1);

        //FINDING BUTTON2//
        button2=findViewById(R.id.BUTTON2);

        //FOR SETTING ACTIONLISSENTER FOR BUTTON2//
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Signup.this,Regester.class);
                startActivityForResult(intent,1);
                startActivity(intent);
            }
        });

        //FOR SETTING ACTION LISSENTER FOR BUTTON1//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=text1.getText().toString();
                String value2=text2.getText().toString();
                String value3=text3.getText().toString();
                if(!value1.isEmpty() && !value2.isEmpty() && !value3.isEmpty()){

                Intent intent=new Intent(Signup.this,Emergency.class);
                startActivity(intent);
            }else if (value1.isEmpty() && value2.isEmpty() && value3.isEmpty()){

                    Toast toast=Toast.makeText(Signup.this,"Please Enter Avobe Informetion",Toast.LENGTH_SHORT);
                    toast.show();

                }
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==1){
        String value=data.getStringExtra("key");
        String value1=data.getStringExtra("key1");
        String value2=data.getStringExtra("key2");
        text1.setText(value);
        text1.setText(value1);
        text1.setText(value2);

    }
}}
