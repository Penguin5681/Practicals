package com.example.practical_8_login_module;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String username = "Penguin";
        final String password = "6969";

        EditText emailEditText = findViewById(R.id.email_editText);
        EditText passwordEditText = findViewById(R.id.password_editText);

        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(view -> {
            if (emailEditText.getText().toString().equals(username) && passwordEditText.getText().toString().equals(password))
                startActivity(new Intent(this, MainActivity2.class));
            else {
                Toast.makeText(this, "Check credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}