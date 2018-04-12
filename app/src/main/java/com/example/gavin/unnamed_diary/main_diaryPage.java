package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;


public class main_diaryPage extends AppCompatActivity {

    ArrayList<String> dataFromMain;
    RecyclerView showing_boxes;
    adapter4Main adapting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        showing_boxes = findViewById(R.id.showing_boxes);
        dataFromMain = new ArrayList<>();
        dataFromMain.add("AAAA");
        dataFromMain.add("BBBB");

        adapting = new adapter4Main(dataFromMain);
        showing_boxes.setAdapter(adapting);
        showing_boxes.setLayoutManager(new LinearLayoutManager(this));
        adapting.notifyDataSetChanged();

    }


}
