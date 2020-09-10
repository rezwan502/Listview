package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview_layout);
        textView = findViewById(R.id.sampleId);

        final List<String> listItem = new ArrayList<String>();
        listItem.add("Andorid");
        listItem.add("Java");
        listItem.add("Kotlin");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sampleId,listItem);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = listItem.get(i);

                Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });



    }
}