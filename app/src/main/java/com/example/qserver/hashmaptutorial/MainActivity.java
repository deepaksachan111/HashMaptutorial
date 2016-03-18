package com.example.qserver.hashmaptutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner =(Spinner)findViewById(R.id.sppinner);
        final ArrayList<Data> ct_name = new ArrayList<>();
        final ArrayList<String> countryname_list = new ArrayList<>();

        HashMap<String, Data> hashMap = new LinkedHashMap<>();
        hashMap.put("One",new Data("One","1"));
        hashMap.put("Two",new Data("Two","2"));
        hashMap.put("Three",new Data("Three","3"));
        hashMap.put("Four",new Data("Four","4"));
        hashMap.put("Five",new Data("Five","5"));

        for(Map.Entry<String,Data> entry : hashMap.entrySet()){
          String key =  entry.getKey();
           Data value = entry.getValue();

            String name = value.getName();
            String id = value.getId();

            countryname_list.add(value.getName());
            ct_name.add(new Data(name,id));
        }

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,countryname_list);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                   Data dd = ct_name.get(position);
                    String selected_item = dd.getId();
                String s = selected_item;
                Toast.makeText(MainActivity.this,"" + s ,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public   void nextss(View v){

        startActivity(new Intent(this,SpinnerExample2.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}
