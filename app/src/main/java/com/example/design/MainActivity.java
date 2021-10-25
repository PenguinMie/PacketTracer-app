package com.example.design;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnbasicbutton, btnnetworkbutton, btnaboutusbutton, btnforumbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnnetworkbutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NETWORKING_COMMAND.class);
            startActivity(intent);
        });

        btnbasicbutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Basic_Configuration.class);
            startActivity(intent);
        });

        btnaboutusbutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, About_Us.class);
            startActivity(intent);
        });

        btnforumbutton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Forum.class);
            startActivity(intent);
        });
    }

    private void initViews(){
        
        btnbasicbutton = findViewById(R.id.basicbutton);
        btnnetworkbutton = findViewById(R.id.networkbutton);
        btnaboutusbutton = findViewById(R.id.aboutusbutton);
        btnforumbutton = findViewById(R.id.forumbutton);
    }
}