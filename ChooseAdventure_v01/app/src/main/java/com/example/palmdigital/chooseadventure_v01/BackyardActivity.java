package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener {

    // Fields

    // Buttons
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        // References
        TextView textView_story     = (TextView) findViewById(R.id.textView_story);
        TextView textView_question  = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
        textView_question.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_left);
        leftButton.setText("Scream");
        leftButton.setOnClickListener(this);

        rightButton = (Button) findViewById(R.id.button_right);
        rightButton.setText("Faint");
        rightButton.setOnClickListener(this);

    }

    public void onClick(View view)
    {
//        // Wake Up
//        if (view.getId() == R.id.button_left)
//        {
//            // Send user to the "Wake Up" Activity
//            Intent i = new Intent(this, ScreamActivity.class);
//            startActivity(i);
//        }
//        // Explore
//        else if (view.getId() == R.id.button_right)
//        {
//            // Send user to the "Explore" Activity
//            Intent i = new Intent(this, FaintActivity.class);
//            startActivity(i);
        }
    }

