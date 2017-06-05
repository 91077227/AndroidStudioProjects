package com.example.palmdigital.clickableimageview_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ImageObject_01 = (ImageView)findViewById(R.id.imageView);
        ImageObject_01.setOnClickListener(this);

        ImageView ImageObject_02 = (ImageView)findViewById(R.id.imageView2);
        ImageObject_02.setOnClickListener(this);

        ImageView ImageObject_03 = (ImageView)findViewById(R.id.imageView3);
        ImageObject_03.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
        {
            Toast.makeText(this, "You have received a message.", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.imageView2)
        {
            Toast.makeText(this, "E-mail sent.", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.imageView3)
        {
            Toast.makeText(this, "You added 'Valerie' to your contacts list.", Toast.LENGTH_SHORT).show();
        }
    }
}
