package com.example.tutorial04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txtWelcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        txtWelcomeMessage = findViewById(R.id.txtWelcomeMessage);
        Intent intent= getIntent();
        String username = intent.getStringExtra("username");
        txtWelcomeMessage.setText("Welcome" + username);
    }
}