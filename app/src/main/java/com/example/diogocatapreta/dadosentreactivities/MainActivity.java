package com.example.diogocatapreta.dadosentreactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diogocatapreta.dadosentreactivities.model.Usuario;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button proxima ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proxima = findViewById(R.id.proximaTelaButton);

        proxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criar a intent
                Intent detalheIntent = new Intent(getApplicationContext(), activity_sol_details.class);

                // Enviando Dados e Objetos
                int number = new Random().nextInt(70);
                String nome = "Joao da Silva";
                //detalheIntent.putExtra("randonNum",number);

                //instaciando um objeto
                Usuario user = new Usuario("Diogo Alcantara", "diogo@gmail.com");


                detalheIntent.putExtra("RANDON",  String.valueOf(number));
                detalheIntent.putExtra("NOME",nome);
                detalheIntent.putExtra("NUMERO", number);
                detalheIntent.putExtra("usuario", user);


                // iniciar a activity
                startActivity(detalheIntent);

            }
        });
    }




}
