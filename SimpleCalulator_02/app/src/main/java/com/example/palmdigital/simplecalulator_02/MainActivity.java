package com.example.palmdigital.simplecalulator_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // Variables
    int sum, num1, num2;

    // Input One
    TextView textView_Top;

    // First Row
    ImageView numberZero01;
    ImageView numberOne01;
    ImageView numberTwo01;
    ImageView numberThree01;
    ImageView numberFour01;
    ImageView numberFive01;
    ImageView numberSix01;
    ImageView numberSeven01;
    ImageView numberEight01;
    ImageView numberNine01;

    // Functions
    ImageView plusSign;
    ImageView minusSign;

    // Input Two
    TextView textView_Middle;

    // Row Two
    ImageView numberZero02;
    ImageView numberOne02;
    ImageView numberTwo02;
    ImageView numberThree02;
    ImageView numberFour02;
    ImageView numberFive02;
    ImageView numberSix02;
    ImageView numberSeven02;
    ImageView numberEight02;
    ImageView numberNine02;

    // Functions
    ImageView equalsSign;

    // Output
    TextView textView_Bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Input One
        textView_Top = (TextView) findViewById(R.id.textView_Top);
        textView_Top.setOnClickListener(this);

        // First Row Of Numbers
        numberZero01 = (ImageView) findViewById(R.id.numberZero01);
        numberZero01.setOnClickListener(this);
        numberOne01 = (ImageView) findViewById(R.id.numberOne01);
        numberOne01.setOnClickListener(this);
        numberTwo01 = (ImageView) findViewById(R.id.numberTwo01);
        numberTwo01.setOnClickListener(this);
        numberThree01 = (ImageView) findViewById(R.id.numberThree01);
        numberThree01.setOnClickListener(this);
        numberFour01 = (ImageView) findViewById(R.id.numberFour01);
        numberFour01.setOnClickListener(this);
        numberFive01 = (ImageView) findViewById(R.id.numberFive01);
        numberFive01.setOnClickListener(this);
        numberSix01 = (ImageView) findViewById(R.id.numberSix01);
        numberSix01.setOnClickListener(this);
        numberSeven01 = (ImageView) findViewById(R.id.numberSeven01);
        numberSeven01.setOnClickListener(this);
        numberEight01 = (ImageView) findViewById(R.id.numberEight01);
        numberEight01.setOnClickListener(this);
        numberNine01 = (ImageView) findViewById(R.id.numberNine01);
        numberNine01.setOnClickListener(this);

        // Functions
        plusSign = (ImageView) findViewById(R.id.plusSign);
        plusSign.setOnClickListener(this);
        minusSign = (ImageView) findViewById(R.id.minusSign);
        minusSign.setOnClickListener(this);

        // Input Two
        textView_Middle = (TextView) findViewById(R.id.textView_Middle);
        textView_Middle.setOnClickListener(this);

        // Second Row Of Numbers
        numberZero02 = (ImageView) findViewById(R.id.numberZero02);
        numberZero02.setOnClickListener(this);
        numberOne02 = (ImageView) findViewById(R.id.numberOne02);
        numberOne02.setOnClickListener(this);
        numberTwo02 = (ImageView) findViewById(R.id.numberTwo02);
        numberTwo02.setOnClickListener(this);
        numberThree02 = (ImageView) findViewById(R.id.numberThree02);
        numberThree02.setOnClickListener(this);
        numberFour02 = (ImageView) findViewById(R.id.numberFour02);
        numberFour02.setOnClickListener(this);
        numberFive02 = (ImageView) findViewById(R.id.numberFive02);
        numberFive02.setOnClickListener(this);
        numberSix02 = (ImageView) findViewById(R.id.numberSix02);
        numberSix02.setOnClickListener(this);
        numberSeven02 = (ImageView) findViewById(R.id.numberSeven02);
        numberSeven02.setOnClickListener(this);
        numberEight02 = (ImageView) findViewById(R.id.numberEight02);
        numberEight02.setOnClickListener(this);
        numberNine02 = (ImageView) findViewById(R.id.numberNine02);
        numberNine02.setOnClickListener(this);

        // Solving Function
        equalsSign = (ImageView) findViewById(R.id.equalsSign);
        equalsSign.setOnClickListener(this);

        // Output
        textView_Bottom = (TextView) findViewById(R.id.textView_Bottom);
        textView_Bottom.setOnClickListener(this);


    }
    public void onClick(View view)
    {

        // Row 1 - Functions
        if (view.getId() == R.id.numberZero01)
        {
            textView_Top.setText("0");
        }
        else if (view.getId() == R.id.numberOne01)
        {
            textView_Top.setText("1");
            num1 = 1;
        }
        else if (view.getId() == R.id.numberTwo01)
        {
            textView_Top.setText("2");
            num1 = 2;
        }
        else if (view.getId() == R.id.numberThree01)
        {
            textView_Top.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.numberFour01)
        {
            textView_Top.setText("4");
            num1 = 4;
        }
        else if (view.getId() == R.id.numberFive01)
        {
            textView_Top.setText("5");
            num1 = 5;
        }
        else if (view.getId() == R.id.numberSix01)
        {
            textView_Top.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.numberSeven01)
        {
            textView_Top.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.numberEight01)
        {
            textView_Top.setText("8");
            num1 = 8;
        }
        else if (view.getId() == R.id.numberNine01)
        {
            textView_Top.setText("9");
            num1 = 9;
        }

        // Row 2 - Functions
        if (view.getId() == R.id.numberZero02)
        {
            textView_Middle.setText("0");
            num2 = 0;
        }
        else if (view.getId() == R.id.numberOne02)
        {
            textView_Middle.setText("1");
            num2 = 1;
        }
        else if (view.getId() == R.id.numberTwo02)
        {
            textView_Middle.setText("2");
            num2 = 2;
        }
        else if (view.getId() == R.id.numberThree02)
        {
            textView_Middle.setText("3");
            num2 = 3;
        }
        else if (view.getId() == R.id.numberFour02)
        {
            textView_Middle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.numberFive02)
        {
            textView_Middle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.numberSix02)
        {
            textView_Middle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.numberSeven02)
        {
            textView_Middle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.numberEight02)
        {
            textView_Middle.setText("8");
            num2 = 8;
        }
        else if (view.getId() == R.id.numberNine02)
        {
            textView_Middle.setText("9");
            num2 = 9;
        }

        // Operation Functions
        if (view.getId() == R.id.plusSign)
        {
            sum = num1 + num2;
            plusSign.setBackgroundColor(0xff888888);
            minusSign.setBackgroundColor(0x00000000);
        }
        else if (view.getId() == R.id.minusSign)
        {
            sum = num1 - num2;
            minusSign.setBackgroundColor(0xff888888);
            plusSign.setBackgroundColor(0x00000000);
        }
        else if (view.getId() == R.id.equalsSign)
        {
            textView_Bottom.setText(sum + "");
        }
    }
}
