package com.example.aplikasiresepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView ImageView, ImageView2, ImageView3, ImageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView = findViewById(R.id.imageView);
        ImageView2 = findViewById(R.id.ImageView2);
        ImageView3 = findViewById(R.id.ImageView3);
        ImageView4 = findViewById(R.id.ImageView4);
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

        ImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity4.class));
            }
        });
        ImageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity5.class));
            }
        });
        ImageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aksi lain, misalnya menampilkan pesan atau membuka URL
                startActivity(new Intent(MainActivity2.this, MainActivity6.class));
            }
        });
    }
}