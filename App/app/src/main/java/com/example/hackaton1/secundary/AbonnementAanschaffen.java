package com.example.hackaton1.secundary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hackaton1.Abonnementen;
import com.example.hackaton1.R;

public class AbonnementAanschaffen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abonnement_aanschaffen);
    }

    public void startAbonnementenActivity(View view){
        Intent intent = new Intent (this, Abonnementen.class);
        startActivity(intent);
    }
}