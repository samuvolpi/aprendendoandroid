package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//declarando
        Button btnMensagem = findViewById(R.id.btnMensagem);
        TextView txtMensagem = findViewById(R.id.txtMensagem);
        Button btnToast = findViewById(R.id.btnToast);
        Button btnDialog = findViewById(R.id.btnDialog);
        Button btnEscreve= findViewById(R.id.btnEscreve);
        TextView fldTexto = findViewById(R.id.fldTexto);

//abertura do app
        String Abertura = "Criar app android";
        txtMensagem.setText(Abertura);
        Toast.makeText(getApplicationContext(),Abertura, Toast.LENGTH_SHORT).show();
//botao mensagem
        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String TextoEscrito = "Bom dia turma";
                txtMensagem.setText(TextoEscrito);
//botao escreve
        btnEscreve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String textoEscrito = fldTexto.getText().toString().toUpperCase().trim();
               txtMensagem.setText(textoEscrito);
            }
        });
//botao toast
        btnToast.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String msgToast = "Minha notificaçao";
                        Toast.makeText(getApplicationContext(),msgToast,Toast.LENGTH_LONG).show();
                    }
                });
//botao dialog
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//instancia o alertadialog
                AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
                dialog.setMessage("Como esta o clima")
                        .setCancelable(false)
                        .setPositiveButton("Chuva", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(getApplicationContext(), "Chuva e Frio", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Sol", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(getApplicationContext(),"Sol e quente", Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });
            }
        });
    }
}