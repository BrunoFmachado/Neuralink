package me.dio.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GerarNovaFrase(View view) {

        String[] frases = {
                "Só exergo vantagens em me contratar!",
                "Quer uma pessoa dedicada? cá estou eu!",
                "o motivo de me contratar? email: Brunomachado2905@gmail.com",
                "proatividade é comigo mesmo!",

        };

        int numero = new Random().nextInt(3); //0 1 2 3

        TextView texto = findViewById(R.id.textresultado);
        texto.setText(frases[numero]);

    }


}