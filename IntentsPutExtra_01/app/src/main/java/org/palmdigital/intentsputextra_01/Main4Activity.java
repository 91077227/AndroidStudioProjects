package org.palmdigital.intentsputextra_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

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
    public void next04(View view)
    {
        // References
        EditText et_noun03 = (EditText) findViewById(R.id.editText_Noun03);
        String str_noun03 = et_noun03.getText().toString();

        EditText et_number01 = (EditText) findViewById(R.id.editText_Number01);
        String str_number01 = et_number01.getText().toString();

        EditText et_shapes01 = (EditText) findViewById(R.id.editText_Shape01);
        String str_shapes01 = et_shapes01.getText().toString();

        String story = newString + " Next you have to bake it in a very hot " +
                str_noun03 + ". " + "When it is done, cut it into " + str_number01 + " " +
                str_shapes01 + ". ";

        Intent i = new Intent(this, Main5Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}
