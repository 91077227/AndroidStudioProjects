package com.example.palmdigital.textview_output_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    // Fields
    TextView textViewDisplayTop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewNum01 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageViewNum02 = (ImageView) findViewById(R.id.imageView02);
        ImageView imageViewNum03 = (ImageView) findViewById(R.id.imageView03);

        textViewDisplayTop = (TextView)findViewById(R.id.textView);

        imageViewNum01.setOnClickListener(this);
        imageViewNum02.setOnClickListener(this);
        imageViewNum03.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView01)
        {
            textViewDisplayTop.setText("1");

        }
        if (view.getId() == R.id.imageView02)
        {
            textViewDisplayTop.setText("2");

        }
        if (view.getId() == R.id.imageView03)
        {
            textViewDisplayTop.setText("3");

        }

    }
}
