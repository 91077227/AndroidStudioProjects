package com.example.palmdigital.chooseadventure_v01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TolietActivity extends AppCompatActivity implements View.OnClickListener {

    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toliet);

        TextView textView_story = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
        textView_question.setText("Do you want to train to a NINJA? 'Yes' or 'HECK YES'?");

        leftButton = (Button) findViewById(R.id.button_left);
        leftButton.setText("Yes");
        leftButton.setOnClickListener(this);

        rightButton = (Button) findViewById(R.id.button_right);
        rightButton.setText("HECK YES");
        rightButton.setOnClickListener(this);
    }
    public void onClick(View view) {

        if (view.getId() == R.id.button_left) {
            // Send user to the "Wake Up" Activity
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
        // Explore
        if (view.getId() == R.id.button_right) {
            // Send user to the "Wake Up" Activity
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
    }
}

