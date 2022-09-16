package com.example.hackaton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackaton1.secundary.AbonnementAanschaffen;

public class Abonnementen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abonnementen);
    }

    public void startMainActivity(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void startActivityTwo(View view){
        Intent intent = new Intent (this, AbonnementAanschaffen.class);
        startActivity(intent);
    }
}