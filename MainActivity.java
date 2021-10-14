package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin, btnclear;
    EditText txtusername, txtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.buttonlogin);
        txtusername = findViewById(R.id.username);
        txtpassword = findViewById(R.id.password);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = txtusername.getText().toString();
                String pass = txtpassword.getText().toString();
                if (uname.equals("admin")&& pass.equals("admin")){
                    Intent intent = new Intent(MainActivity.this, halaman2.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"SELAMAT DATANG", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"MAAF USERNAME ATAU PASSWORD ANDA SALAH", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void MethodBersih(View view) {
        txtusername.setText("");
        txtpassword.setText("");
        txtusername.requestFocus();
    }


    public void MethodLogin(View view) {
        Intent intent = new Intent(MainActivity.this, halaman2.class);
        startActivity(intent);
    }
}