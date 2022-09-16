package com.example.hackaton1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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