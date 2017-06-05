package org.palmdigital.intentsputextra_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void next01(View view)
    {
        // References
        EditText et_adj01 = (EditText) findViewById(R.id.editText_adj01);
        String str_adj01 = et_adj01.getText().toString();

        EditText et_nation01 = (EditText) findViewById(R.id.editText_nationality01);
        String str_nation01 = et_nation01.getText().toString();

        EditText et_person01 = (EditText) findViewById(R.id.editText_person01);
        String str_person01 = et_person01.getText().toString();

        String story = "Pizza was invented by a " + str_adj01 + " " + str_nation01 + " chef named " + str_person01 + ".";

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
