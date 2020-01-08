package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    //to get the xml design in view
    private RecyclerView recyclerView;
    private  RecyclerView.Adapter adapter;
    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recycleID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        listItems = new ArrayList<>();

//        ListItem item1 = new ListItem("Movie1","It's About Biography","FiveStar");
//        ListItem item2 = new ListItem("Movie2","It's About Lovoraphy","FiveStar");

        for(int i=0; i<20;i++){

            ListItem item = new ListItem(
                    "Item"+(i+1),
                    "Description","Excellent"); // All data shoulbe be passed through Constructor

            listItems.add(item);
        }
//        listItems.add(item1);
//        listItems.add(item2);
        //adding adapter
        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);


    }
}
