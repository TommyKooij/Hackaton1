package com.example.hackaton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Abonnementen extends AppCompatActivity {

    public EditText huidigeCursus;
    public EditText huidigeAbonnement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abonnementen);
    }

    public void startMainActivity(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void startAbonnementAanschaffenActivity(View view){
        Intent intent = new Intent (this, AbonnementAanschaffen.class);
        startActivity(intent);
    }
}