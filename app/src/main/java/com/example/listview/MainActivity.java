package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        List<String> listItem = new ArrayList<String>();
        listItem.add("Andorid");
        listItem.add("Java");
        listItem.add("Kotlin");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.sampleId,listItem);
        listView.setAdapter(listAdapter);



    }
}