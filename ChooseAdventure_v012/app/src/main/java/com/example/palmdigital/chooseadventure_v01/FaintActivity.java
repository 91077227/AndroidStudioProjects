package com.example.palmdigital.chooseadventure_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FaintActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        // References
        TextView textView_story     = (TextView) findViewById(R.id.textView_story);
        TextView textView_question     = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("You made a delicious soup!");
        textView_question.setText("Yum! The End.");
    }
}
