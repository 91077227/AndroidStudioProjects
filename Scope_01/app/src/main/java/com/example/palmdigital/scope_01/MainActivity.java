package com.example.palmdigital.scope_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// We are outside of Main Activity class
// We are outside any methods

// Understanding how scope works is very important!

public class MainActivity extends AppCompatActivity
    {
        // In the MainActivity class, but I'm outside any methods.

        // Fields - These variables have classwide scope -- Any code in the class can see
        //                             and use these variables
        String myString;
        // Declare a field that is a double named enemyHealth
        Double enemyHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Here, we are inside the onCreate() method, which is inside the MainActivity class.

        // When we 'declare' or 'define' a variable, we use the following format:
        // dataType variableName; <--- This is a variable declaration/definition
        // Some Examples:
        int myInt; // <--- This is declaring a variable of dataType 'int' and named 'myInt.'
        double myDouble; // <--- This is declaring a variable of dataType 'double' named 'myDouble'
        TextView textView_story; // <--- This is declaring a variable of dataType 'TextView' named
                                 // 'textView_story.'
        ImageView imageView_ex; // <--- dataTpe is ImageView, variableName is imageView_ex.

        // Assigning a value to a declared variable
        // after we declare a variable , we can assign a value to it
        // variableName - someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        myInt = 10; // <--- Setting the value of myInt to 10, myInt had dataType 'int' is an int
        myDouble = 20.12; // <--- myDouble gets the value 20.12.
        textView_story = (TextView) findViewById(R.id.textView_story); // Set the value of textView_story
                                                                       // to the UI element
                                                                       // R.id.textView_story
        imageView_ex = (ImageView) findViewById(R.id.imageView_android_guy);

        // You know you can declare and assign in the same step.
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        int myInt2 = 25; // This is a declaration AND an assignment
        myInt2 = 50; // This is only an assignment.
        // The difference ia the dataType! 'int'
        myString = "This is a string."; // <--- A declaration AND an assignment.
        myString = "This is another string."; // <--- This is just an assignment.

        enemyHealth = 20.5;

        // !!!!! Where ever you declare a variable determines that variable's scope!\
        // In other words, if I declare a variable here in the onCreate() method, only nothing
        // outside of onCreate() can see it... Let's prove this...

    } // End of onCreate method
        public void myAwesomeMethod01()
        {
            myString = "What's going on here...";
            enemyHealth = 25.5;
        } // End of myAwesomeMethod01()

        public void myAwesomeMethod02()
        {
            enemyHealth = 30.5;
        }

} // End of Class

// Do not do stuff out here!