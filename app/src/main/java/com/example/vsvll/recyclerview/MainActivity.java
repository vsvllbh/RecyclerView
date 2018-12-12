package com.example.vsvll.recyclerview;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //here we will set the layout manger to Linear layout since we
        //want to show the vertical data in our screen.

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] dataText = {"Apple", "Mango", "Orange","Apple", "Mango", "Orange","Apple", "Mango", "Orange","Apple", "Mango", "Orange"};

        //Now we will set the adapter to the recycler view
        recyclerView.setAdapter(new programmingRecyclerView(dataText));


    }

}
