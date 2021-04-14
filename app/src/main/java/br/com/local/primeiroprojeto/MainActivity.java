// Pacotes
package br.com.local.primeiroprojeto;

// Bibliotecas

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    //Criando o menu na barra do aplicativo

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflar o menu ao layout atual
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    //Criando as ações para os itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCadastrar:

                Toast.makeText(getApplicationContext(),
                        "cliquei em cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mAlterar:

                Toast.makeText(getApplicationContext(),
                        "cliquei em alterar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mExcluir:

                Toast.makeText(getApplicationContext(),
                        "cliquei em excluir",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mPesquisar:

                Toast.makeText(getApplicationContext(),
                        "Cliquei em pesquisar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mVoltar:

                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}