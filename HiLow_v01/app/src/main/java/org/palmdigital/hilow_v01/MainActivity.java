package org.palmdigital.hilow_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        TextView textView_winOrLose = (TextView) findViewById(R.id.textView_winOrLose);
        TextView textView_warning = (TextView) findViewById(R.id.textView_warning);

        EditText editText_input = (EditText) findViewById(R.id.editText_input);

        Random answer = new Random();
        //int answer = NumberUtils.getRandomInt(1, 100);
        for (int i = 0; i < 8; i++)
        {
            int guess = input;
            if (guess == answer)
            {
                textView_winOrLose.setText("You Win!");
                System.exit(0);
            }
            else if (guess > answer)
            {
                textView_warning.setText("Too High!");
            }
            else
            {
                textView_warning.setText("Too Low!");
            }
        }
        textView_winOrLose.setText("You Lose!");
    }
}
}
