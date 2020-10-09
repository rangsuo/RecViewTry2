package com.example.recviewtry2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new Adapter(this);
        booksRecView = findViewById(R.id.booksRecView);
        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Books> books=new ArrayList<>();
        books.add(new Books(1, "1Q84", "Haruki Murakami", 1350, "https://upload.wikimedia.org/wikipedia/en/thumb/5/59/1Q84_%28United_States_edition%29.jpg/220px-1Q84_%28United_States_edition%29.jpg","A work of maddenning brilliance",
                "Long Description"));
        books.add(new Books(2, "The Myth Of Sisyphus", "Albert Camus", 300, "http://ecx.images-amazon.com/images/I/51SM%2BBv%2BWeL._SY445_QL70_.jpg","One of the most influential works of this century, The Myth of Sisyphus and Other Essays is a crucial exposition of existentialist thought. Influenced by works such as Don Juan and the novels of Kafka, these essays begin with a meditation on suicide; the question of living or not living in a universe devoid of order or meaning.",
                "Long Description"));
        adapter.setBooks(books);
    }
}