package com.example.mymultiactivityapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText editTextName = findViewById(R.id.editTextName);
        Button buttonBack = findViewById(R.id.buttonBack);

        buttonBack.setOnClickListener(v -> {

            String name = editTextName.getText().toString();


            Intent resultIntent = new Intent();
            resultIntent.putExtra("name", name);


            setResult(RESULT_OK, resultIntent);


            finish();
        });
    }
}
