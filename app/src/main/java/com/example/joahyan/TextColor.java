package com.example.joahyan;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        tv_code_six.setBackgroundColor(Color.GRAY);
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        tv_code_eight.setBackgroundColor(0xFF00FFFF);
    }
}