package com.example.placesofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView areaImage;
    private TextView areaName,areaLocation;
    //private ImageButton callButton, locationButton,shareButton;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        extras = getIntent().getExtras();

        areaName = (TextView) findViewById(R.id.areaName);
        areaLocation = (TextView) findViewById(R.id.areaLocation);
        areaImage = (ImageView) findViewById(R.id.areaImage);

        if(extras != null){

            areaName.setText(extras.getString("name"));
            areaLocation.setText(extras.getString("description"));


            if(extras.getString("name").equals("Sundarban")){

                areaImage.setImageDrawable(getResources().getDrawable(R.drawable.sban));


            }

           // setUp(areaName,areaLocation);

        }
    }




}
