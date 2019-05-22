package com.example.applicazioneesame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Porfirio was here
public class MainActivity extends AppCompatActivity {


    Button bottoneVai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottoneVai = (Button) findViewById(R.id.btnVai);
        final Intent intent = new Intent(MainActivity.this, SecondActivity.class);



        bottoneVai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editNome = (EditText) findViewById(R.id.editNome);
                String nomeUtente = editNome.getText().toString();

                intent.putExtra("nomeutente", nomeUtente);
                startActivity(intent);
            }
        });
    }
}
