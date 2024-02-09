package com.example.practical_3_changing_colors;

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
        TextView textView3 = findViewById(R.id.text3);
        TextView textView4 = findViewById(R.id.text4);
        TextView textView5 = findViewById(R.id.text5);

        textView1.setTextColor(getResources().getColor(R.color.white, null));
        textView2.setTextColor(getResources().getColor(R.color.Aqua, null));
        textView3.setTextColor(getResources().getColor(R.color.Wheat, null));
        textView4.setTextColor(getResources().getColor(R.color.DeepPink, null));
        textView5.setTextColor(getResources().getColor(R.color.OrangeRed, null));

    }
}