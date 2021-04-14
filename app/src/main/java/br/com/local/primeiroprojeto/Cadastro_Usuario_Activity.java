package br.com.local.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Cadastro_Usuario_Activity extends AppCompatActivity {

    // declarar os componente que irei acessar pelo id do XML. vão ser componentes globais
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_usuario_layout);

        // vai executar o layout
        setContentView(R.layout.cadastro_usuario_layout);

        // realizar a ligação do componente que esta no java com o componente no XML
        btnVoltar = findViewById(R.id.btnVoltar);

        // executando uma ação de click
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //voltar para a janela de login, abrindo essa janela
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));

                // fechando a janela
                finish();
            }
        });
    }
}