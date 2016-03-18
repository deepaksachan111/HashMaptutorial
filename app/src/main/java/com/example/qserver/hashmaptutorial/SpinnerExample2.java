package com.example.qserver.hashmaptutorial;

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
import java.util.LinkedHashMap;

public class SpinnerExample2 extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
     Data items[];
    Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_example2);

         spinner2 =(Spinner)findViewById(R.id.sppinner2);
        items = new Data[3];
        items[0] = new Data( "key1","value1" );
        items[1] = new Data( "key2","value2" );
        items[2] = new Data( "key3","value3" );

        ArrayList<String> listitem = new ArrayList<>();

        for(Data data : items){
            String datas =data.getName();
            listitem.add(datas);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listitem );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.sppinner)
        {
            //do this
        }
        else if(spinner.getId() ==R.id.sppinner2)
        {
            Data d = items[position];
            String ids = d.getId();
            Toast.makeText(SpinnerExample2.this, "" + ids, Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
