package com.example.diogocatapreta.dadosentreactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.diogocatapreta.dadosentreactivities.model.Usuario;


public class activity_sol_details extends AppCompatActivity {

    private TextView randonNumTxView;
    private TextView nomeTxView;
    private TextView emailTxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol_details);

        randonNumTxView = findViewById(R.id.TxViewNumero);
        nomeTxView = findViewById(R.id.TxViewNome);
        emailTxView = findViewById(R.id.TxViewEmail);

        //int  randonNum = getIntent().getIntExtra("RAND",0);

        Bundle dados = getIntent().getExtras();

        String nome = dados.getString("NOME");
        String valor = dados.getString("RANDON");
        int numero = dados.getInt("NUMERO");
        Usuario user = (Usuario) dados.getSerializable( "usuario");

        randonNumTxView.setText(String.valueOf(numero));
        //nomeTxView.setText(nome);
        nomeTxView.setText(user.getNome());
        emailTxView.setText(user.getEmail());





    }
}
