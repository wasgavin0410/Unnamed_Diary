package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

/**
 * //Failed to find layer (com.example.gavin.unnamed_diary/com.example.gavin.unnamed_diary.entrance_diary#0) in layer parent (no-parent)
    >>>RecyclerView: No adapter attached; skipping layout

 之後將arrayList結合SQL
 * */

public class main_diaryPage extends AppCompatActivity {

    private ArrayList<String> dataFromMain;
    private RecyclerView showing_boxes;
    private adapter4Main adapting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        dataFromMain = new ArrayList<>();
        showing_boxes = findViewById(R.id.showing_boxes);

        //showing_boxes.setLayoutManager(new LinearLayoutManager(this));
        adapting = new adapter4Main(dataFromMain);
        showing_boxes.setAdapter(adapting);

        dataFromMain.add("Ahh");
        adapting.notifyDataSetChanged();

    }

    public class adapting_activity extends page_view{

        //用來連接entrance_page以及activity_page

        public adapting_activity(Context context){
            super(context);

            View view = LayoutInflater.from(context).inflate(R.layout.activity_page,null);

            //將activity_page視為一個View來存放

            addView(view);
        }
    }
}
