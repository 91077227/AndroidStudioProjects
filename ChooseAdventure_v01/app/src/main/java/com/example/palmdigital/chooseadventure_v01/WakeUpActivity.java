package com.example.palmdigital.chooseadventure_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.palmdigital.chooseadventure_v01.R.id.textView_story;

public class WakeUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        TextView textView_story     = (TextView) findViewById(R.id.textView_story);
        textView_story.setText("You wake up and have a boring day. THE END.");


    }
}
