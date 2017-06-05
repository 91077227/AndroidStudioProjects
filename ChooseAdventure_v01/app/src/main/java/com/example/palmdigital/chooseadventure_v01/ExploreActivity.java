package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

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

        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        // Buttons
        leftButton = (Button) findViewById(R.id.button_left);
        leftButton.setText("Backyard");
        leftButton.setOnClickListener(this);

        rightButton = (Button) findViewById(R.id.button_right);
        rightButton.setText("Toilet");
        rightButton.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        // Wake Up
        if (view.getId() == R.id.button_left)
        {
            // Send user to the "Wake Up" Activity
            Intent i = new Intent(this, BackyardActivity.class);
            startActivity(i);
        }
        // Explore
        else if (view.getId() == R.id.button_right)
        {
            // Send user to the "Explore" Activity
            Intent i = new Intent(this, ToiletActivity.class);
            startActivity(i);
        }
    }

}
