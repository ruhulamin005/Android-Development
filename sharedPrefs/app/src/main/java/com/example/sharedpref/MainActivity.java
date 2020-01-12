package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring variables matching with XML design
    private TextView result;
    private Button saveButton;
    private EditText enterMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing those design by their ID into our Variables
        enterMessage = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.resultText);
        saveButton = (Button) findViewById(R.id.button);
        

    }
}
