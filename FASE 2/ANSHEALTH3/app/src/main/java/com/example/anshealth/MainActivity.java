package com.example.anshealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }

    public void selecionarBotao (View v) {

        TextView texto = findViewById(R.id.button);
        texto.setText("BOTAO CLICADO");
    }


}