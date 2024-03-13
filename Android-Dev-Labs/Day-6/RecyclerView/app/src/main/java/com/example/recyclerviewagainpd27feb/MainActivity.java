package com.example.recyclerviewagainpd27feb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel> modelArrayList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        modelArrayList = new ArrayList<>();

        modelArrayList.add(new DataModel("Movie 1", "Oppenheimer"));
        modelArrayList.add(new DataModel("Movie 2", "Interstellar"));
        modelArrayList.add(new DataModel("Movie 3", "12th Fail"));
        modelArrayList.add(new DataModel("Movie 4", "Deadpool"));
        modelArrayList.add(new DataModel("Movie 5", "Avengers: Civil War"));

        recyclerView.setAdapter(new MyAdapter(modelArrayList, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}