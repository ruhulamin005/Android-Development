package com.example.showactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();

        showMessage = (TextView) findViewById(R.id.messageTextView);

        //Check Extra Intent empty or not

        if(extras!= null){

            String message = extras.getString("Message");
            showMessage.setText(message);
        }

    }
}
