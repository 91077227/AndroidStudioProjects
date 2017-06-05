package com.example.palmdigital.toastpractice_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "My name is Valerie and my favorite animal is wolf.",
                Toast.LENGTH_LONG).show();
    }
}
