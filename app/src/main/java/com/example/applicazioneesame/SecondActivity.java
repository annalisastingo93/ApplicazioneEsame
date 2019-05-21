package com.example.applicazioneesame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = findViewById(R.id.txtNome);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nomeutente");

        textView.setText("Ciao " + nome + "! Come va? ");


    }
}
