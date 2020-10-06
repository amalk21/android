package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listview);


        final ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Sachin");
        arrayList.add("Dravid");
        arrayList.add("Kohli");
        arrayList.add("Dhoni");
        arrayList.add("Ganguly");
        arrayList.add("Jadeja");
        arrayList.add("Sehwag");
        arrayList.add("kumble");
        arrayList.add("Warner");
        arrayList.add("Smith");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }
}