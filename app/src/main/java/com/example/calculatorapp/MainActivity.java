package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(android.view.View v)
    {
        EditText input1 = findViewById(R.id.input_one_field);
        String input1_str = input1.getText().toString();
        double input1_number = Double.parseDouble(input1_str);

        EditText input2 = findViewById(R.id.input_two_field);
        String input2_str = input2.getText().toString();
        double input2_number = Double.parseDouble(input2_str);

        double answer_value = input1_number + input2_number;

        EditText answer = findViewById(R.id.answer_field);
        String answer_str = Double.toString(answer_value);
        answer.setText(answer_str);
    }

    public void sub(android.view.View v)
    {
        EditText input1 = findViewById(R.id.input_one_field);
        String input1_str = input1.getText().toString();
        double input1_number = Double.parseDouble(input1_str);

        EditText input2 = findViewById(R.id.input_two_field);
        String input2_str = input2.getText().toString();
        double input2_number = Double.parseDouble(input2_str);

        double answer_value = input1_number - input2_number;

        EditText answer = findViewById(R.id.answer_field);
        String answer_str = Double.toString(answer_value);
        answer.setText(answer_str);
    }

    public void mul(android.view.View v)
    {
        EditText input1 = findViewById(R.id.input_one_field);
        String input1_str = input1.getText().toString();
        double input1_number = Double.parseDouble(input1_str);

        EditText input2 = findViewById(R.id.input_two_field);
        String input2_str = input2.getText().toString();
        double input2_number = Double.parseDouble(input2_str);

        double answer_value = input1_number * input2_number;

        EditText answer = findViewById(R.id.answer_field);
        String answer_str = Double.toString(answer_value);
        answer.setText(answer_str);
    }

    public void div(android.view.View v)
    {
        EditText input1 = findViewById(R.id.input_one_field);
        String input1_str = input1.getText().toString();
        double input1_number = Double.parseDouble(input1_str);

        EditText input2 = findViewById(R.id.input_two_field);
        String input2_str = input2.getText().toString();
        double input2_number = Double.parseDouble(input2_str);

        double answer_value = input1_number / input2_number;

        EditText answer = findViewById(R.id.answer_field);
        String answer_str = Double.toString(answer_value);
        answer.setText(answer_str);
    }

}
