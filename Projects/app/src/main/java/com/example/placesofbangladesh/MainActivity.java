package com.example.placesofbangladesh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {

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

        ListItem item1 = new ListItem("Sundarban","Sathkhira, Bagerhat");
        ListItem item2 = new ListItem("Movie1","It's About Biography");
        ListItem item3 = new ListItem("Movie2","It's About Lovoraphy");
        ListItem item4 = new ListItem("Movie1","It's About Biography");
        ListItem item5 = new ListItem("Movie2","It's About Lovoraphy");
        ListItem item6 = new ListItem("Movie1","It's About Biography");
        ListItem item7 = new ListItem("Movie2","It's About Lovoraphy");
        ListItem item8 = new ListItem("Movie1","It's About Biography");
        ListItem item9 = new ListItem("Movie2","It's About Lovoraphy");
        ListItem item10 = new ListItem("Movie1","It's About Biography");


//        for(int i=0; i<10;i++){
//
//            ListItem item = new ListItem(
//                    "Item"+(i+1),
//                    "Description"); // All data shoulbe be passed through Constructor
//
//            listItems.add(item);
//        }
        listItems.add(item1);
        listItems.add(item2);
        listItems.add(item3);
        listItems.add(item4);
        listItems.add(item5);
        listItems.add(item6);
        listItems.add(item7);
        listItems.add(item8);
        listItems.add(item9);
        listItems.add(item10);



        //adding adapter
        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}
