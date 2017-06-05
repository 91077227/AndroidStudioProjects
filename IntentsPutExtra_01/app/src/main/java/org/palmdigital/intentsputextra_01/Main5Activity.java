package org.palmdigital.intentsputextra_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

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
    public void next05(View view)
    {
        // References
        EditText et_food01 = (EditText) findViewById(R.id.editText_Food01);
        String str_food01 = et_food01.getText().toString();

        EditText et_food02 = (EditText) findViewById(R.id.editText_Food02);
        String str_food02 = et_food02.getText().toString();

        EditText et_number02 = (EditText) findViewById(R.id.editText_Number02);
        String str_number02 = et_number02.getText().toString();

        String story = newString + "Some kids like " + str_food01 + " pizza the best, but my favorite is the " + str_food02 +
                " pizza. If I could, I would eat pizza " + str_number02 + " times a day!";

        Intent i = new Intent(this, Main6Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
