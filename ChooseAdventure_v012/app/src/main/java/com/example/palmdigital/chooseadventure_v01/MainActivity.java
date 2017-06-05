package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Fields

    // Buttons
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // References
        TextView textView_story     = (TextView) findViewById(R.id.textView_story);
        TextView textView_question  = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_left);
        leftButton.setText("Wake Up");
        leftButton.setOnClickListener(this);

        rightButton = (Button) findViewById(R.id.button_right);
        rightButton.setText("Explore");
        rightButton.setOnClickListener(this);

    } // End of "onCreate()"

    public void onClick(View view)
    {
        // Wake Up
        if (view.getId() == R.id.button_left)
        {
            // Send user to the "Wake Up" Activity
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        }
        // Explore
        else if (view.getId() == R.id.button_right)
        {
            // Send user to the "Explore" Activity
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    }

}