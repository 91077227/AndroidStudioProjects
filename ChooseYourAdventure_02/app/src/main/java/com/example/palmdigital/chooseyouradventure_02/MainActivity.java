package com.example.palmdigital.chooseyouradventure_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_Story;
    TextView textView_Question;
    Button leftButton;
    Button rightButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Story =    (TextView) findViewById(R.id.textView_Story);
        textView_Story.setOnClickListener(this);
        textView_Question = (TextView) findViewById(R.id.textView_Question);
        textView_Story.setOnClickListener(this);

        leftButton = (Button) findViewById(R.id.leftButton);
        rightButton = (Button) findViewById(R.id.rightButton);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.leftButton)
        {
            textView_Story.setText("You wake up and have a boring day. The End.");
            textView_Question.setText("");
            leftButton.setText("");
            rightButton.setText("");
            leftButton.setBackgroundColor(0x00000000);
            rightButton.setBackgroundColor(0x00000000);
        }
        if (view.getId() == R.id.rightButton)
        {
            textView_Story.setText("");
            textView_Question.setText("");
            leftButton.setText("");
            rightButton.setText("");
        }
    }
}
