package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRV;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);

        booksRV = findViewById(R.id.booksRecyclerView);
        booksRV.setAdapter(adapter);
        booksRV.setLayoutManager(new LinearLayoutManager(this));

        /*
        books.add(new Book(
                2,
                345,
                "El Prinicipito",
                "Antoine De Saint-Exupery",
                "https://imagessl4.casadellibro.com/a/l/t5/94/9788478887194.jpg",
                "Fábula mítica y relato filosófico",
                "Long description")
        );
        books.add(new Book(
                3,
                211,
                "",
                "",
                "",
                "",
                "Long description")
        );
        books.add(new Book(
                4,
                124,
                "",
                "",
                "",
                "",
                "Long description")
        );*/

        adapter.setBooks(Utils.getInstance().getAllBooks());
    }
}