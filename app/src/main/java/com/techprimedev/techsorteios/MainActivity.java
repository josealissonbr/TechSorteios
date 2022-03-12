package com.techprimedev.techsorteios;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GerarNumero(View view){

        EditText lowerValue = findViewById(R.id.intervalo1);
        EditText upperValue = findViewById(R.id.intervalo2);
        // initialize a Random object somewhere; you should only need one
        Random random = new Random();
        int upperBound = Integer.parseInt(upperValue.getText().toString());
        int lowerBound = Integer.parseInt(lowerValue.getText().toString());

        // generate a random integer from 0 to 899, then add 100
        int numeroSorteado = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
        Toast.makeText(getApplicationContext(), "Número sorteado: " + String.valueOf(numeroSorteado), Toast.LENGTH_LONG).show();
    }
}
