package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring variables matching with XML design
    private TextView result;
    private Button saveButton;
    private EditText enterMessage;

    //variables for shared prefs
    private SharedPreferences myPrefs;
    private static final String PREFS_NAME= "myPrefsFile";
    // It actually create an xml file
    //where data are being stored.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing those design by their ID into our Variables || fetching the variables with design
        enterMessage = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.resultText);
        saveButton = (Button) findViewById(R.id.button);

        //setting on click listener with saveButton
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Putting Data into myPrefsFile
                myPrefs = getSharedPreferences(PREFS_NAME,0);
                SharedPreferences.Editor editor = myPrefs.edit(); //This allows us to edit

                editor.putString("message",enterMessage.getText().toString());// getting message from text field
                //Have to save all by commit

                editor.commit();


            }
        });

        //Getting data back and shoeing into Text View
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME,0);
        if( prefs.contains("message")){
            String message = prefs.getString("message","not Found");
            result.setText("Message:"+ message);



        }


    }
}
