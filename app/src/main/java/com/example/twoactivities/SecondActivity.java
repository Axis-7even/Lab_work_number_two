package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // отримати Intent, який активує дане Activity
        Intent intent = getIntent();
        // отримати стрічку з intent по ключу EXTRA_MESSAGE
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // використати findViewById() щоб отримати посилання на textView з розмітки
        TextView textView = findViewById(R.id.text_message);
        // встановити текст для textView
        textView.setText(message);
    }
}