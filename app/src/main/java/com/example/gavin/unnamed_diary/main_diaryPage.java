package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
* TODO
*
* 換頁動畫  SQL or SharedPreference?反正選一個可以儲存ArrayList的
* */


public class main_diaryPage extends AppCompatActivity {

    ArrayList<String> dataFromMain = new ArrayList<>();
    RecyclerView showing_boxes;
    adapter4Main adapting;

    private theDataBase db_helper;
    public Cursor c_atMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        showing_boxes = findViewById(R.id.showing_boxes);
        initialDB();

        reading();

        adapting = new adapter4Main(dataFromMain);
        showing_boxes.setAdapter(adapting);
        showing_boxes.setLayoutManager(new LinearLayoutManager(this));
        adapting.notifyDataSetChanged();

    }

    private void initialDB(){

        //初始化階段，讓database在此activity應用
        db_helper = new theDataBase(getApplicationContext());
        c_atMain = db_helper.selecter();

    }

    private void reading(){

        //讀取資料庫內容
        //若無，則自動新增一段文字(下述為示範)
        //若有，則讀取資料，並將其放入arrayList之中
        String reading = "SELECT * FROM diary_table";
        c_atMain = db_helper.database.rawQuery(reading,null);

        if (c_atMain.getCount() == 0){

            db_helper.insert("TEST");
            db_helper.insert("TEST2");
            c_atMain = db_helper.database.rawQuery(reading,null);

        }

        if (c_atMain.moveToFirst()){

            //dataFromMain.add(c_atMain.getString(1));

            do{
                dataFromMain.add(c_atMain.getString(1));
            }while (c_atMain.moveToNext());

        }

        db_helper.database.close();


    }


}
