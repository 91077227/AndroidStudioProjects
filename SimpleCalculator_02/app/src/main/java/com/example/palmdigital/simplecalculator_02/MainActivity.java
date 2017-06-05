package com.example.palmdigital.simplecalculator_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_Top;
    TextView textView_Middle;
    TextView textView_Bottom;

    ImageView plusImage;
    ImageView minusImage;
    ImageView equalsImage;

    ImageView numberOne01;
    ImageView numberTwo01;
    ImageView numberThree01;
    ImageView numberFour01;
    ImageView numberFive01;
    ImageView numberSix01;
    ImageView numberSeven01;
    ImageView numberEight01;
    ImageView numberNine01;

    ImageView numberOne02;
    ImageView numberTwo02;
    ImageView numberThree02;
    ImageView numberFour02;
    ImageView numberFive02;
    ImageView numberSix02;
    ImageView numberSeven02;
    ImageView numberEight02;
    ImageView numberNine02;

    int num1;
    int num2;
    int sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Top = (TextView) findViewById(R.id.textView_Top);
        textView_Middle.setOnClickListener(this);
        textView_Middle = (TextView) findViewById(R.id.textView_Middle);
        textView_Middle.setOnClickListener(this);
        textView_Bottom = (TextView) findViewById(R.id.textView_Bottom);
        textView_Bottom.setOnClickListener(this);

        plusImage = (ImageView) findViewById(R.id.plusImage);
        plusImage.setOnClickListener(this);
        minusImage = (ImageView) findViewById(R.id.minusImage);
        minusImage.setOnClickListener(this);
        equalsImage = (ImageView) findViewById(R.id.equalsImage);
        equalsImage.setOnClickListener(this);

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
    }
    public void onClick(View view)
    {
        // --- Start Of Row One
        if (view.getId() == R.id.numberOne01)
        {
            textView_Top.setText("0");
            num1 = 0;
        }
        if (view.getId() == R.id.numberTwo01)
        {
            textView_Top.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.numberThree01)
        {
            textView_Top.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.numberFour01)
        {
            textView_Top.setText("4");
            num1 = 4;
        }
        if (view.getId() == R.id.numberFive01)
        {
            textView_Top.setText("5");
            num1 = 5;
        }
        if (view.getId() == R.id.numberSix01)
        {
            textView_Top.setText("6");
            num1 = 6;
        }
        if (view.getId() == R.id.numberSeven01)
        {
            textView_Top.setText("7");
            num1 = 7;
        }
        if (view.getId() == R.id.numberEight01)
        {
            textView_Top.setText("8");
            num1 = 8;
        }
        if (view.getId() == R.id.numberNine01)
        {
            textView_Top.setText("9");
            num1 = 9;
        }
        // --- End of First Row

        // --- Start of Row Two
        if (view.getId() == R.id.numberOne02)
        {
            textView_Top.setText("0");
            num1 = 0;
        }
        if (view.getId() == R.id.numberTwo02)
        {
            textView_Top.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.numberThree02)
        {
            textView_Top.setText("3");
            num1 = 3;
        }
        if (view.getId() == R.id.numberFour02)
        {
            textView_Top.setText("4");
            num1 = 4;
        }
        if (view.getId() == R.id.numberFive02)
        {
            textView_Top.setText("5");
            num1 = 5;
        }
        if (view.getId() == R.id.numberSix02)
        {
            textView_Top.setText("6");
            num1 = 6;
        }
        if (view.getId() == R.id.numberSeven02)
        {
            textView_Top.setText("7");
            num1 = 7;
        }
        if (view.getId() == R.id.numberEight02)
        {
            textView_Top.setText("8");
            num1 = 8;
        }
        if (view.getId() == R.id.numberNine02)
        {
            textView_Top.setText("9");
            num1 = 9;
        }
        // --- End Of Row Two

        // --- Start Of Functions
        if (view.getId() == R.id.minusImage)
        {
            plusImage.clearColorFilter();
            minusImage.setBackgroundColor(0xff0000ff);
            sum = num1 - num2;
        }
        if (view.getId() == R.id.plusImage)
        {
            minusImage.clearColorFilter();
            plusImage.setBackgroundColor(0xff444444);
            sum = num1 + num2;
        }
        if (view.getId() == R.id.equalsImage)
        {
            textView_Bottom.setText("" + sum);
        }
    }
}
