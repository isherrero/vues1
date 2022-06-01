package com.example.vues1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn1);
        Toast.makeText(this, "Premiere Exemple", Toast.LENGTH_SHORT).show();

    }

    public void fisher(View view) {
        Toast.makeText(this, "ssssssssss", Toast.LENGTH_SHORT).show();
    }
}