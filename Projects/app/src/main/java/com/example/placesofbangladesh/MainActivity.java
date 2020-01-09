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
        ListItem item2 = new ListItem("Cox’s Bazar","Cox’s Bazar, Chittagoang");
        ListItem item3 = new ListItem("The St. Martin’s Island","Saint Martin, Cox's Bazar");
        ListItem item4 = new ListItem("Kuakata","Kuakata, Patuakhali");
        ListItem item5 = new ListItem("Jaflong","Jaflong, Sylhet");
        ListItem item6 = new ListItem("Sajek Valley","Sajek Valley, Rangamati");
        ListItem item7 = new ListItem("The Shat Gambuj Mosque","Bagerhat,Khula");
        ListItem item8 = new ListItem("Paharpur","Paharpur,Naogaon");
        ListItem item9 = new ListItem("National Memorial","National Memorial, Savar");
        ListItem item10 = new ListItem("Sonargaon","Sonargaon, Narayanganj");


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
