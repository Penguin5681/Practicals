package com.example.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button skill_based_btn = findViewById(R.id.skill_based);
        Button hardcore_btn = findViewById(R.id.hardcore);
        Button exit_btn = findViewById(R.id.exit);

        skill_based_btn.setOnClickListener(view -> {
            Toast.makeText(this, "Skill Based Matchmaking", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, PlayScreen.class);
            startActivity(intent);
        });

        hardcore_btn.setOnClickListener(view -> {
            Toast.makeText(this, "Welcome to Hardcore",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, hardcore_mode.class);
            startActivity(intent);
        });

        exit_btn.setOnClickListener(view -> {
            Toast.makeText(this, "See ya again champ", Toast.LENGTH_SHORT).show();
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        });
    }
}