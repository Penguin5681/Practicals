package com.example.practical_2_my_info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.text1);
        TextView textView2 = findViewById(R.id.text2);

        textView1.setTextColor(getResources().getColor(R.color.Beige, null));
        textView2.setTextColor(getResources().getColor(R.color.DeepPink, null));

    }
}