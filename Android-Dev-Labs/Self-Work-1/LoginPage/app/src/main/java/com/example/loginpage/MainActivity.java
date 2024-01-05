package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String username = "thechillguy69";
        String password = "6969";

        Button login_button = findViewById(R.id.login_btn);
        login_button.setOnClickListener(v -> {
            String username_text = ((EditText)findViewById(R.id.username_text)).getText().toString();
            String password_text = ((EditText)findViewById(R.id.password_text)).getText().toString();

            if (username_text.equals(username) && password_text.equals(password)) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(MainActivity.this, "Incorrect Details", Toast.LENGTH_SHORT).show();
            }
        });

        Button lucky_button = findViewById(R.id.lucky_btn);
        lucky_button.setOnClickListener(v -> {
            String username_text = ((EditText)findViewById(R.id.username_text)).getText().toString();
            String password_text = ((EditText)findViewById(R.id.password_text)).getText().toString();

            if (username_text.equals(username) && password_text.equals(password)) {
                Intent intent = new Intent(MainActivity.this, LuckyActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(MainActivity.this, "You Ain't Lucky, Wrong Details", Toast.LENGTH_SHORT).show();
            }
        });
    }
}