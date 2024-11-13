package com.example.aplikasiresepmakanan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String CORRECT_USERNAME = "Fajar 123";
    private static final String CORRECT_PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameEditText = findViewById(R.id.username);
        EditText passwordEditText = findViewById(R.id.password);
        Button loginButton = findViewById(R.id.loginButton);


        loginButton.setOnClickListener(v -> {
            String inputUsername = usernameEditText.getText().toString();
            String inputPassword = passwordEditText.getText().toString();

            if (inputUsername.equals(CORRECT_USERNAME) && inputPassword.equals(CORRECT_PASSWORD)) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Username atau sandi salah, coba lagi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}