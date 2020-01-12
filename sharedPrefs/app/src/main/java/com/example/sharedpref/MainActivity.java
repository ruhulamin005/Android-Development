package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

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
                
            }
        });


    }
}
