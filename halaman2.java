package com.example.belajarandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class halaman2 extends AppCompatActivity {

    private static final String[] MUSIC = new String[]{
            "Heal The World", "When I Was Your Man", "Fana Merah Jambu", "Menghapus Jejakmu", "You and I", "Yesterday"
    };

    ImageView kembali, mj, bruno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        AutoCompleteTextView editText = findViewById(R.id.pilihan);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MUSIC);
        editText.setAdapter(adapter);

        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(halaman2.this, MainActivity.class));
            }
        });

        mj = findViewById(R.id.mj);
        mj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(halaman2.this, halaman3.class));
            }
        });

        bruno = findViewById(R.id.bruno);
        bruno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(halaman2.this, halaman4.class));
            }
        });
    }
    }