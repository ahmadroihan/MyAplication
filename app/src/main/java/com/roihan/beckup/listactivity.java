package com.roihan.beckup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class listactivity extends AppCompatActivity {
//private ArrayList<String> ListPeople =new ArrayList<>();
    private ListView listview;
    private NameAdapter nameAdapter;

    List<String> names=new ArrayList<String>();
//private ListView Listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);

        listview   = (ListView) findViewById(R.id.anu);
        names.add("durian");
        names.add("semangka");
        names.add("mangga");
        nameAdapter=new NameAdapter(this,android.R.layout.simple_list_item_1,names);
        listview.setAdapter(nameAdapter);


    }
}
