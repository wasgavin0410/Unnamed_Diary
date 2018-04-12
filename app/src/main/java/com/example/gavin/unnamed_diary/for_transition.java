package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class for_transition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.transitional_page);

//        Intent intent = new Intent(getApplicationContext(),main_diaryPage.class);
//        startActivity(intent);

    }

    public class adapting_activity extends page_view{

        //用來連接entrance_page以及transitional_page

        public adapting_activity(Context context){
            super(context);

            View view = LayoutInflater.from(context).inflate(R.layout.transitional_page,null);

            //將activity_page視為一個View來存放

            addView(view);
        }
    }
}
