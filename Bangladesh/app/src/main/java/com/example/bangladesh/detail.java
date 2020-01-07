package com.example.bangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    private ImageView image;
    private TextView nameText;
    private TextView detailText;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        image = (ImageView)findViewById(R.id.imageID);
        nameText = (TextView) findViewById(R.id.name);
        detailText = (TextView) findViewById(R.id.detailID);

        extras = getIntent().getExtras();

        if(extras!=null){
            String name = extras.getString("Name");
            String detail = extras.getString("Detail");
            setUp(name,detail);

        }
    }

    public void setUp(String name, String detail) {

        if (name.equals("Royal Bengal Tiger")){
            //KingFisher Staff
            image.setImageDrawable(getResources().getDrawable(R.drawable.tiger));
            nameText.setText(name);
            detailText.setText(detail);

        }
        else if(name.equals("Water Lily")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.sapla));
            nameText.setText(name);
            detailText.setText(detail);


        }
        else if(name.equals("Magpie")){
            image.setImageDrawable(getResources().getDrawable(R.drawable.doel));
            nameText.setText(name);
            detailText.setText(detail);

        }


    }


}
