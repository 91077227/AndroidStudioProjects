package com.example.palmdigital.scope_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Fields

    int myInt01;
    double myDouble01;
    String myString01;
    TextView textView_01;
    ImageView imageView_01;

    int myInt02;
    double myDouble02;
    String myString02;
    TextView textView_02;
    ImageView imageView_02;

    int myInt03;
    double myDouble03;
    String myString03;
    TextView textView_03;
    ImageView imageView_03;

    int myInt04;
    double myDouble04;
    String myString04;
    TextView textView_04;
    ImageView imageView_04;

    int myInt05;
    double myDouble05;
    String myString05;
    TextView textView_05;
    ImageView imageView_05;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myAwesomeMethod01()
    {
        int myInt;
        double myDouble;
        String myString;
        TextView textView_01;
        ImageView imageView_01;

        myInt02 = 4;
                myDouble02 = 4.5;
        myString02 = "This is a string!";
                textView_02 = (TextView) findViewById(R.id.textView_01);
        imageView_02 = (ImageView) findViewById(R.id.imageView_01);

    }
    public void myAwesomeMethod02()
    {
        int myInt02;
        double myDouble02;
        String myString02;
        TextView textView_02;
        ImageView imageView_02;
    }
    public void myAwesomeMethod03()
    {
        int myInt03;
        double myDouble03;
        String myString03;
        TextView textView_03;
        ImageView imageView_03;
    }
    public void myAwesomeMethod04()
    {
        int myInt04;
        double myDouble04;
        String myString04;
        TextView textView_04;
        ImageView imageView_04;
    }
    public void myAwesomeMethod05()
    {
        int myInt05;
        double myDouble05;
        String myString05;
        TextView textView_05;
        ImageView imageView_05;
    }
}