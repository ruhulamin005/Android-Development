package com.example.bangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView saplaView;
    private  ImageView tigerView;
    private  ImageView doelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saplaView = (ImageView) findViewById(R.id.saplaID);
        tigerView = (ImageView) findViewById(R.id.tigerID);
        doelView = (ImageView) findViewById(R.id.doelID);

        saplaView.setOnClickListener(this);
        tigerView.setOnClickListener(this);
        doelView.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tigerID:
                Intent tigerIntent = new Intent(MainActivity.this,detail.class);
                tigerIntent.putExtra("Name","Royal Bengal Tiger");
                tigerIntent.putExtra("Detail","The Bengal tiger is a Panthera tigris tigris population native to the " +
                        "Indian subcontinent. ... Specially in  Bangladesh. It is also known as the Royal Bengal tiger.");
                startActivity(tigerIntent);


                break;
            case R.id.saplaID:
                Intent saplaIntent = new Intent(MainActivity.this, detail.class);
                saplaIntent.putExtra("Name","Water Lily");
                saplaIntent.putExtra("Detail","Water lilies are rooted in soil in bodies of water, with leaves" +
                        " and flowers floating on or emergent from the surface." +
                        " The leaves are round, with a radial notch in Nymphaea and Nuphar, but fully circular in Victoria and Euryale");
                startActivity(saplaIntent);

                break;
            case R.id.doelID:
                Intent doelIntent = new Intent(MainActivity.this, detail.class);
                doelIntent.putExtra("Name","Magpie");
                doelIntent.putExtra("Detail","The oriental magpie-robin (Copsychus saularis) is a small passerine bird that was formerly ...." +
                        " The magpie robin is the national bird of Bangladesh, where it is common" +
                        " and known as the doyel or doel (Bengali: দোয়েল)");
                startActivity(doelIntent);
                break;


        }
    }
}
