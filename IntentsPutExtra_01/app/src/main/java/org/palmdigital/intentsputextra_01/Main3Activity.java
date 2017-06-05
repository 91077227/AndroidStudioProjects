package org.palmdigital.intentsputextra_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //TextView tv_story = (TextView) findViewById(R.id.textView_story);

        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

        //tv_story.setText(newString);
    }
    public void next03(View view)
    {
        // References
        EditText et_adj03 = (EditText) findViewById(R.id.editText_adj03);
        String str_adj03 = et_adj03.getText().toString();

        EditText et_adj04 = (EditText) findViewById(R.id.editText_adj04);
        String str_adj04 = et_adj04.getText().toString();

        EditText et_pNoun01 = (EditText) findViewById(R.id.editText_pNoun01);
        String str_pNoun01 = et_pNoun01.getText().toString();

        String story = newString + "Then you cover it with " + str_adj03 +
                " sauce, " + str_adj04 + " cheese, and fresh chopped "
                + str_pNoun01 + ". ";

        Intent i = new Intent(this, Main4Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
