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

        Intent intent = this.getIntent();

        dataFromMain = new ArrayList<>();
        dataFromMain.add("Ahh");
        showing_boxes = findViewById(R.id.showing_boxes);

        adapting = new adapter4Main(dataFromMain);
        showing_boxes.setAdapter(adapting);
        showing_boxes.setLayoutManager(new LinearLayoutManager(this));
        adapting.notifyDataSetChanged();

        //↑上面這些的工作程序可以移到entrance_diary執行嗎？
        //目前理解的狀況是，似乎在
        //page_adapter().initialData().RecyclerView()取得空的View資料
        //抓到的是空的layout，當然會出現RecyclerView沒辦法連接adapter的問題

        //雖然聽起來真的很廢，不過我覺得翻頁以後的頁面可以是空白的(或有圖片)
        //然後那個view連接的class可以自動跳轉到main_diaryPage
    }


}
