package br.com.local.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class PerfilActivity extends AppCompatActivity {
    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil_layout);

        toolbar = findViewById(R.id.mToolBar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
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
                return false;
            }
        });
    }
}