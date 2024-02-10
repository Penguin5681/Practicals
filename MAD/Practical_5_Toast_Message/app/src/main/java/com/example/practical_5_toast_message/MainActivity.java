package com.example.practical_5_toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_text);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();
        });
    }
}