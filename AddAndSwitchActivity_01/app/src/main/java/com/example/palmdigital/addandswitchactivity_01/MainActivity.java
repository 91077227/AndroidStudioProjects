package com.example.palmdigital.addandswitchactivity_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSwitch = (Button) findViewById(R.id.buttonSwitch);
        buttonSwitch.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        // Here's the screen-switching code
        Intent i = new Intent(this, WakeUp.class);
        startActivity(i);
    }
}