package com.example.hackaton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSecondActivity(View view){
       Intent intent = new Intent (this, Cursussen.class);
       startActivity(intent);
    }

    public void startThirdActivity(View view){
        Intent intent = new Intent (this, Abonnementen.class);
        startActivity(intent);
    }

    public void startFourthActivity(View view){
        Intent intent = new Intent (this, PersonalCoach.class);
        startActivity(intent);
    }

    public void startFifthActivity(View view){
        Intent intent = new Intent (this, QR.class);
        startActivity(intent);
    }
}