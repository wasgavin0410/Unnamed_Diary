package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

public class main_diaryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        //TODO
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
