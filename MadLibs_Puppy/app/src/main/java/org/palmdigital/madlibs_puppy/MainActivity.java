package org.palmdigital.madlibs_puppy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText et_Color1;
    EditText et_BodyPart01;
    EditText et_Noun01;
    EditText et_Verb01;
    EditText et_Adjective01;
    EditText et_Adjective02;
    EditText et_Verb02;
    EditText et_Noun02;
    EditText et_Noun03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeStory(View view)
    {

        et_Color1 = (EditText) findViewById(R.id.editText_Color01);
        et_BodyPart01 = (EditText) findViewById(R.id.editText_BodyPart01);
        et_Noun01 = (EditText) findViewById(R.id.editText_Noun01);
        et_Verb01 = (EditText) findViewById(R.id.editText_Verb01);
        et_Adjective01 = (EditText) findViewById(R.id.editText_Adjective01);
        et_Adjective02 = (EditText) findViewById(R.id.editText_Adjective02);
        et_Verb02 = (EditText) findViewById(R.id.editText_Verb02);
        et_Noun02 = (EditText) findViewById(R.id.editText_Noun02);
        et_Noun03 = (EditText) findViewById(R.id.editText_Noun03);

        TextView textView_result = (TextView) findViewById(R.id.textView_result);

        String str_Color1 = et_Color1.getText().toString();
        String str_BodyPart1 = et_BodyPart01.getText().toString();
        String str_Noun1 = et_Noun01.getText().toString();
        String str_Verb1 = et_Verb01.getText().toString();
        String str_Adjective1 = et_Adjective01.getText().toString();
        String str_Adjective2 = et_Adjective02.getText().toString();
        String str_Verb2 = et_Verb02.getText().toString();
        String str_Noun2 = et_Noun02.getText().toString();
        String str_Noun3 = et_Noun03.getText().toString();

        String story = "Today, I saw him again. When he looked at me with those " + str_Color1 + " eyes, it makes my " + str_BodyPart1 + " go pitterpat, and I feel as if I have " + str_Noun1 + " in my stomach. When he scrunches his nose, I want to " + str_Verb1 + " him softly. He is so " + str_Adjective1 + " and " + str_Adjective2 + ". Tomorrow he will be mine. For now he " + str_Verb2 + " in the store " + str_Noun2 + " looking at me. " + str_Noun3 + " love is hard to resist!";
        //story = story + str_Color1 + str_BodyPart1 + str_Noun1 + str_Verb1 + str_Adjective1 + str_Adjective2 + str_Verb2 + str_Noun2 + str_Noun3;

        textView_result.setText(story);
    }
}
