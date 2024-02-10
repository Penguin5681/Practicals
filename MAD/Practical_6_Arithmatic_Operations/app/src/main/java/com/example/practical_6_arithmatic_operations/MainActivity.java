package com.example.practical_6_arithmatic_operations;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input_1);
        input2 = findViewById(R.id.input_2);
        output = findViewById(R.id.output);

        Button addButton = findViewById(R.id.add_button);
        Button subtractButton = findViewById(R.id.subtract_button);
        Button divideButton = findViewById(R.id.divide_button);
        Button multiplyButton = findViewById(R.id.multiply_button);

        addButton.setOnClickListener(view -> {
            performOperation('+');
        });

        subtractButton.setOnClickListener(view -> {
            performOperation('-');
        });

        divideButton.setOnClickListener(view -> {
            performOperation('/');
        });

        multiplyButton.setOnClickListener(view -> {
            performOperation('*');
        });
    }

    private void performOperation(char operation) {
        int a = Integer.parseInt(input1.getText().toString());
        int b = Integer.parseInt(input2.getText().toString());

        switch (operation) {
            case '+':
                output.setText(String.format(Locale.getDefault(), "%d", a + b));
                break;
            case '-':
                output.setText(String.format(Locale.getDefault(), "%d", a - b));
                break;
            case '/':
                output.setText(String.format(Locale.getDefault(), "%d", a / b));
                break;
            case '*':
                output.setText(String.format(Locale.getDefault(), "%d", a * b));
                break;
        }
    }
}
