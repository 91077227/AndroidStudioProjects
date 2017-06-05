package com.example.palmdigital.simplecalculator_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewObject01;
    TextView textView_top;
    TextView textView_middle;
    TextView textView_bottom;

    ImageView imageViewObject01;
    ImageView imageViewObject02;
    ImageView imageViewObject03;

    ImageView imageViewObject04;

    ImageView imageViewObject05;
    ImageView imageViewObject06;
    ImageView imageViewObject07;

    ImageView imageView_Equals;

    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For input, Bottom
        textViewObject01 = (TextView)findViewById(R.id.textView01);
        textViewObject01.setOnClickListener(this);
        textView_top = (TextView)findViewById(R.id.textView01);
        textView_middle = (TextView)findViewById(R.id.textView02);
        textView_bottom = (TextView)findViewById(R.id.textView03);

        // For number icons, 1-3
        imageViewObject01 = (ImageView)findViewById(R.id.imageView01);
        imageViewObject01.setOnClickListener(this);
        imageViewObject02 = (ImageView)findViewById(R.id.imageView02);
        imageViewObject02.setOnClickListener(this);
        imageViewObject03 = (ImageView)findViewById(R.id.imageView03);
        imageViewObject03.setOnClickListener(this);

        //For add sign
        imageViewObject04 = (ImageView)findViewById(R.id.imageView04);

        //For input, Middle
        TextView textViewObject02 = (TextView)findViewById(R.id.textView02);
        textViewObject02.setOnClickListener(this);
        textView_middle = (TextView)findViewById(R.id.textView02);

        //For number icons, 4-6
        imageViewObject05 = (ImageView)findViewById(R.id.imageView05);
        imageViewObject05.setOnClickListener(this);
        imageViewObject06 = (ImageView)findViewById(R.id.imageView06);
        imageViewObject06.setOnClickListener(this);
        imageViewObject07 = (ImageView)findViewById(R.id.imageView07);
        imageViewObject07.setOnClickListener(this);

        imageView_Equals = (ImageView)findViewById(R.id.imageView_Equals);
        imageView_Equals.setOnClickListener(this);


    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView01)
        {
            textView_top.setText("1");
            num1 = 1;
        }
        if (view.getId() == R.id.imageView02)
        {
            textView_top.setText("2");
            num1 = 2;
        }
        if (view.getId() == R.id.imageView03)
        {
            textView_top.setText("3");
            num1 = 3;
        }


        if (view.getId() == R.id.imageView05)
        {
            textView_middle.setText("4");
            num2 = 4;
        }
        if (view.getId() == R.id.imageView06)
        {
            textView_middle.setText("5");
            num2 = 5;
        }
        if (view.getId() == R.id.imageView07)
        {
            textView_middle.setText("6");
            num2 = 6;
        }

        if (view.getId() == R.id.imageView_Equals)
        {
            int sum = num1 + num2;
            textView_bottom.setText("" + sum);
        }
    }
}
