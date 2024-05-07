package com.tahaidra.geocalc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    private EditText lengthEditText;
    private EditText widthEditText;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        lengthEditText = findViewById(R.id.length_edit_text);
        widthEditText = findViewById(R.id.width_edit_text);
        resultTextView = findViewById(R.id.result_text_view);
    }

    @SuppressLint("StringFormatInvalid")
    public void calculateArea(View view) {
        double length = Double.parseDouble(lengthEditText.getText().toString());
        double width = Double.parseDouble(widthEditText.getText().toString());
        double area = length * width;
        resultTextView.setText(getString(R.string.app_name, area));
    }
}
