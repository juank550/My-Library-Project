package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnCurrent, btnRead, btnWish, btnFavorites, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllBooks.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
            startActivity(intent);
        });

    }

    public void initViews(){
        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnCurrent = findViewById(R.id.btnCurrent);
        btnRead = findViewById(R.id.btnRead);
        btnWish = findViewById(R.id.btnWish);
        btnFavorites = findViewById(R.id.btnFavorites);
        btnAbout = findViewById(R.id.btnAbout);
    }



}