package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lbclick(View view) {
        i++;
        TextView textView = findViewById(R.id.textView2);
        textView.setText(Integer.toString(i));
    }

    public void rbclick(View view) {
        i--;
        TextView textView = findViewById(R.id.textView2);
        textView.setText(Integer.toString(i));
    }

    public void handleClick(View view) {
        TextView textView = findViewById(R.id.textView2);
        textView.setText(Integer.toString(i));
    }
}

