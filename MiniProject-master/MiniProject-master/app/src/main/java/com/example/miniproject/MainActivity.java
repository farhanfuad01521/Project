package com.example.miniproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView heading;
    private Button button1;
    private Button button2;
    private AlertDialog.Builder alertdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FIND HEADING//
        heading=findViewById(R.id.HEADING);

        //FIND TWO BUTTON//
        button1=findViewById(R.id.BUTTON1);
        button2=findViewById(R.id.BUTTON2);

        //SET CLICKLISTENER FOR BUTTON 2//
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertdialog=new AlertDialog.Builder(MainActivity.this);

                //FOR SETTING TITLE//
                alertdialog.setTitle(R.string.AllertText);

                //FOR SETTING MESSAGE//
                alertdialog.setMessage(R.string.AllertTextMessage);

                //FOR SETTING ICON//
                alertdialog.setIcon(R.drawable.question);

                alertdialog.setCancelable(false);

                //FOR SETTING POSSITIVE BUTTON//
                alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        //EXIT//
                        finish();

                    }
                });
                //FOR SETTING NEGETIVE BUTTON//
                alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast toast=Toast.makeText(MainActivity.this,"You have clicked no button",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });

                alertdialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast toast=Toast.makeText(MainActivity.this,"You have clicked cancel button",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                });
                AlertDialog alertDialog=alertdialog.create();
                alertDialog.show();


            }
        });

        //FOR SETTING ACTIONLISENTER FOR BUTTON1//
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
            }
        });
    }
}
