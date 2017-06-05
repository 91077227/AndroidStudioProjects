package com.example.palmdigital.toast_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Hello luv!",
                Toast.LENGTH_LONG).show();

        Toast.makeText(MainActivity.this, "My name is Wheatley!",
                Toast.LENGTH_LONG).show();

        Toast.makeText(MainActivity.this, "And I'm from Aperture Science!",
                Toast.LENGTH_LONG).show();
    }
}
