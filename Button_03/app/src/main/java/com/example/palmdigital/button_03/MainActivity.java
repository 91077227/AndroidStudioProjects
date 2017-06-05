package com.example.palmdigital.button_03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setBackgroundColor(0xff0000ff);
        buttonObject01.setText("The Blue Pill");

        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setBackgroundColor(0xffff0000);
        buttonObject02.setText("The Red Pill");


        // Let's make our button a click listener so it listens for clicks
        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "*You were taken to space. (Space Core: SPAACCEEEE!)", Toast.LENGTH_SHORT).show();
        }
        if(view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "*You were taken to Snowdin! (Papyrus: LOOK SANS, A HUMAN!)", Toast.LENGTH_SHORT).show();
        }

    }
}
