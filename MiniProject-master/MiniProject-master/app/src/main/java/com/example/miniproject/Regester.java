package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Regester extends AppCompatActivity {
    private TextView heading;
    private TextView firstname;
    private TextView lastname;
    private TextView Email;
    private TextView phonenumber;
    private TextView password;
    private TextView gender;
    private TextView blood;

    private EditText text1;
    private EditText text2;
    private EditText text3;
    private EditText text4;
    private EditText text5;
    private EditText text6;

    private RadioButton male;
    private RadioButton female;

    private Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regester);

        //FIND HEADING//
        heading=findViewById(R.id.HEADING);

        //FINDING FIRST NAME//
        firstname=findViewById(R.id.FASTNAME);

        //FINDING LAST NAME//
        lastname=findViewById(R.id.LASTNAME);

        //FINDING EMAIL//
        Email=findViewById(R.id.Emailaddress);

        //FINDING PHONENUMBER//
        phonenumber=findViewById(R.id.PhoneNumber);

        //FINDING PASSWORD//
        password=findViewById(R.id.PASSWORD);

        //FINDING GENDER//
        gender=findViewById(R.id.Gender);

        //FINDING BLOOD//
        blood=findViewById(R.id.Blood);

        //FINDING TEXT//
        text1=findViewById(R.id.EditTest1);
        text2=findViewById(R.id.EditTest2);
        text3=findViewById(R.id.EditTest3);
        text4=findViewById(R.id.EditTest4);
        text5=findViewById(R.id.EditTest5);
        text6=findViewById(R.id.EditTest6);


        //FINDING BUTTON//
        button1=findViewById(R.id.BUTTON1);


        //SET ACCTION LISENTER FOR BUTTON1//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=text1.getText().toString();


                Intent intent=new Intent(Regester.this,Signup.class);
                intent.putExtra("key",value1);
                setResult(1,intent);
                finish();


                String value2=text2.getText().toString();
                Intent intent1=new Intent(Regester.this,Signup.class);
                intent1.putExtra("key1",value2);
                setResult(1,intent1);
                finish();


                String value3=text5.getText().toString();
                Intent intent2=new Intent(Regester.this,Signup.class);
                intent2.putExtra("key2",value3);
                setResult(1,intent2);
                finish();
            }
        });





    }
}
