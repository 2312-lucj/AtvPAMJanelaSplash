package com.example.atividadepamjanelasplash;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button buttonRegister, buttonLogin;
    private EditText editEmail, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonRegister = findViewById(R.id.btn_register);
        buttonLogin = findViewById(R.id.btn_login);
        editEmail = findViewById(R.id.edt_login_email);
        editPassword = findViewById(R.id.edt_login_password);

        buttonRegister.setOnClickListener(btnRegister -> {
            Toast.makeText(getApplicationContext(), "Usuário Cadastrado com Sucesso!", Toast.LENGTH_SHORT).show();
        });

        buttonLogin.setOnClickListener(btnLogin -> {
            String user = editEmail.getText().toString();
            String password = editPassword.getText().toString();

            if (user.equalsIgnoreCase("etecia") && password.equalsIgnoreCase("etecia")) {
                Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Usuário ou Senha Incorreta!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private Context getApplicationContext() {
    }
}
