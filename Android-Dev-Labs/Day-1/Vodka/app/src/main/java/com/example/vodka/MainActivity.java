package com.example.vodka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.greet);
//        EditText editText = findViewById(R.id.nameBox);
        button.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Good Luck " + ((EditText)findViewById(R.id.nameBox)).getText(), Toast.LENGTH_SHORT).show());
    }
}