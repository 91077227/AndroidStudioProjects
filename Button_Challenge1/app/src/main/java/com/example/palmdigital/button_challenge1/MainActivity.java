package com.example.palmdigital.button_challenge1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject03 = (Button)findViewById(R.id.buttonMyButton03);
        buttonObject03.setOnClickListener(this);
        buttonObject03.setBackgroundColor(0xffcccccc);
        buttonObject03.setText("Messages");

        Button buttonObject02 = (Button)findViewById(R.id.buttonMyButton02);
        buttonObject02.setOnClickListener(this);
        buttonObject02.setBackgroundColor(0xff888888);
        buttonObject02.setText("Email");


        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton01);
        buttonObject01.setOnClickListener(this);
        buttonObject01.setBackgroundColor(0xff444444);
        buttonObject01.setText("Contacts");
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "Contacts: \n \n" +
                    " Parents \n" +
                    " Katie \n" +
                    " Helayna", Toast.LENGTH_SHORT).show();
            Log.i("info", "Contacts: \n \n Parents \n Katie \n Helayna");
        }
        if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "Select from list of emails: \n \n hacker@deepweb.com \n myemail@gmail.com \n friends@yahoo.com", Toast.LENGTH_SHORT).show();
            Log.i("info", "Select from list of emails: \n" +
                    "hacker@deepweb.com \n" +
                    "myemail@gmail.com \n" +
                    "friends@gmail.com");
        }
        if (view.getId() == R.id.buttonMyButton03)
        {
            Toast.makeText(this, "You have no messages.", Toast.LENGTH_SHORT).show();
            Log.i("info", "You have no messages.");
        }
    }
}
