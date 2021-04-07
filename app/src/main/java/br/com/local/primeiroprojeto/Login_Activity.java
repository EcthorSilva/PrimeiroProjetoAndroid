package br.com.local.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    EditText edtUsuario, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
    }

    public void loginToPrincipal(View view) {

        String usuario, senha;

        usuario = edtUsuario.getText().toString();
        senha = edtSenha.getText().toString();

        if (usuario.equals("ecthor") && senha.equals("1234")) {
            Intent irPrincipal = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(irPrincipal);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario ou senha invalidos",
                    Toast.LENGTH_LONG).show();
        }
    }

    public void singUpToPrincipal(View view) {
        // mostra uma mensagem para o usuario
        //Toast.makeText(getApplicationContext(), "Carregando", Toast.LENGTH_LONG ).show();

        //abrir janela de cadastro

        Intent abrirJanela = new Intent(getApplicationContext(), Cadastro_Usuario_Activity.class);
        startActivity(abrirJanela);
    }
}